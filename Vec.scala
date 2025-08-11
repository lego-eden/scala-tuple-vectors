package vectors

import scala.compiletime.ops.int.S

/** Represents a tuple containing only a single type
  * For example `Vec[Int, 3]` = `(Int, Int, Int)`
  */
type Vec[+T, Len <: Int] <: Tuple = Len match
  case 0 => EmptyTuple
  case S[n] => T *: Vec[T, n]

/** Stuff you can only do with a [[Vec]]
  */
sealed trait VecOps[Tup <: Tuple, +A]:
  type Return[+T] <: Tuple
  extension (tup: Tup)
    
    def vmap[B](f: A => B): Return[B]
    def foreach[U](f: A => U): Unit
    def count(p: A => Boolean): Int
    def find(p: A => Boolean): Option[A]
    def foldLeft[B](z: B)(op: (B, A) => B): B
    def foldRight[B](z: B)(op: (A, B) => B): B

    def sum[A1 >: A: Numeric as num]: A1 =
      tup.foldLeft(num.zero)(num.plus)
    def product[A1 >: A: Numeric as num]: A1 =
      tup.foldLeft(num.one)(num.times)
    infix def dot[A1 >: A: Numeric as num](other: Tup): A1 =
      tup.iterator
        .zip(other.iterator)
        .map(num.times.tupled)
        .sum
    def *[A1 >: A: Numeric as num](other: Tup)(using VecOps[Tuple.Zip[Tup, Tup], (A1, A1)]) =
      tup.zip(other).vmap(num.times.tupled)
    def +[A1 >: A: Numeric as num](other: Tup)(using VecOps[Tuple.Zip[Tup, Tup], (A1, A1)]) =
      tup.zip(other).vmap(num.plus.tupled)
    def -[A1 >: A: Numeric as num](other: Tup)(using VecOps[Tuple.Zip[Tup, Tup], (A1, A1)]) =
      tup.zip(other).vmap(num.minus.tupled)
    inline def /[A1 >: A: ([x] =>> Fractional[x] | Integral[x]) as num](scalar: A1) =
      inline num match
        case frac: Fractional[A1] => tup.vmap(frac.div(_, scalar))
        case int: Integral[A1] => tup.vmap(int.quot(_, scalar))
    def *[A1 >: A: Numeric as num](scalar: A1) =
      tup.vmap(num.times(_, scalar))

    def iterator: Iterator[A] =
      tup.productIterator.asInstanceOf[Iterator[A]]

object VecOps:

  given VecOps[EmptyTuple, Nothing] with
    type Return[+T] = EmptyTuple
    extension (tup: EmptyTuple)
      def vmap[B](f: Nothing => B): Return[B] = EmptyTuple
      def foreach[U](f: Nothing => U): Unit = ()
      def count(p: Nothing => Boolean): Int = 0
      def find(p: Nothing => Boolean): Option[Nothing] = None
      def foldLeft[B](z: B)(op: (B, Nothing) => B): B = z
      def foldRight[B](z: B)(op: (Nothing, B) => B): B = z
  end given

  given [A, Tail <: Tuple, TailVecOps <: VecOps[Tail, A]](using tailVecOps: TailVecOps): VecOps[A *: Tail, A] with
    type Return[+T] = T *: tailVecOps.Return[T]
    extension (tup: A *: Tail)
      def vmap[B](f: A => B): Return[B] = 
        f(tup.head) *: tup.tail.vmap(f)

      def foreach[U](f: A => U): Unit =
        f(tup.head)
        tup.tail.foreach(f)
        
      def count(p: A => Boolean): Int =
        val x = if p(tup.head) then 1 else 0
        x + tup.tail.count(p)
      
      def find(p: A => Boolean): Option[A] =
        val x *: xs = tup
        if p(x) then Some(x)
        else xs.find(p)
      
      def foldLeft[B](z: B)(op: (B, A) => B): B =
        val acc = op(z, tup.head)
        tup.tail.foldLeft(acc)(op)
        
      def foldRight[B](z: B)(op: (A, B) => B): B =
        val result = tup.tail.foldRight(z)(op)
        op(tup.head, result)
  end given
end VecOps