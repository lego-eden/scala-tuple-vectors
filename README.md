# A library to treat tuples as collections (and mathematical vectors)

## Getting started
Add the following code to a new scala file `veclib.scala`:
```scala
//> using scala 3.7
//> using dep "dev.legoeden::scala-vectors-lib::0.1.0,url=https://github.com/lego-eden/scala-tuple-vectors/releases/download/0.1.0/scala-vectors-lib-0.1.0.jar"
```

Then run the repl with `scala repl veclib.scala`. Run
```scala
import vectors.Vec.{*, given}
```

You should now be able to run `(0, 1) + (1, 0)`, and it should return `(1, 1)`

## Motivation and usage
This is a library which add a few utilities to treat tuples as collections, and also vectors, in the mathematical sense.

If you want a point in space you might use a `(Int, Int)` or something.
Very nice! So what if you try to add two points to each other?
```scala
scala> (1, 0) + (0, 1)
-- [E008] Not Found Error: -------------
1 |(1, 0) + (0, 1)
  |^^^^^^^^
  |value + is not a member of (Int, Int)
1 error found
```

Well Sh*t >:(

But thats fine right, we can just define an extension method and have it work :D
```scala
extension (t: (Int, Int))
  def +(u: (Int, Int)): (Int, Int) =
    val (x1, y1) = t
    val (x2, y2) = u
    (x1 + x2, y1 + y2)
```

```scala
scala> (1, 0) + (0, 1)
val res0: (Int, Int) = (1,1)
```

Nice! It works as expected :D ! But what if we decide we want to have 3D points also.
```scala
scala> (1, 0, 1) + (0, 1, 0)
-- [E008] Not Found Error: ------------------
1 |(1, 0, 1) + (0, 1, 0)
  |^^^^^^^^^^^
  |value + is not a member of (Int, Int, Int)
1 error found
```

Oof ._.

Point is, you can't cover all the cases of tuples, and there might be even more functions like a dot product, component wise multiplication, so on and so forth.

So what is the point of this library? You basically get functions which work for tuples of any arity, the most basic of which is probably `vmap`, which is your normal map function, returning a new tuple of the same arity, but with different component-types. It works on the union-type of the tuple, so if your tuple is of type `(Int, String)`, the function you pass to `vmap` needs to take `Int | String`.

There is also component wise addition, multiplication, subtraction, and division. Scalar multiplication and division. You also get type-accurate swizzling...

## What is swizzling?
Swizzling is the same as selecting multiple elements of a tuple. A normal index-operation returns the element at that index. A swizzle-operation returns a tuple of elements at the corresponding indices. It looks something like this:
```scala
val a = (1,2,3,4)
a.swizzle(3,2,1,0) ==> (4,3,2,1)
a.swizzle(0,1)     ==> (1,2)
a.swizzle(0,1,0,1) ==> (1,2,1,2)
a.swizzle(0,0,0)   ==> (1,1,1)

val b = ('a', 'b', 'c')
b.swizzle(2, 1, 0) ==> ('c', 'b', 'a')
b.swizzle(0, 1, 2) ==> ('a', 'b', 'c') // does nothing
b.swizzle()        ==> ()
```

There are also shorter methods available under `vectors.swizzling.extensions` which allow you to write the following instead.
```scala
val a = (1,2,3,4)

a.xyzw ==> (1,2,3,4) // does nothing
a.rgba ==> (1,2,3,4) // does nothing
a.xyz  ==> (1,2,3)   // first three components
a.agbr ==> (4,3,2,1) // reverses the tuple
```

And yeah, thats basically it!