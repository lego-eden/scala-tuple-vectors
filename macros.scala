package vectors

import scala.quoted.*
import scala.compiletime.ops.int.S

extension [T <: Tuple](tup: T)
  transparent inline def swiz(inline indices: Int*) =
    ${ swizMacro('tup, 'indices) }

def swizMacro[T <: Tuple: Type](tup: Expr[T], indices: Expr[Seq[Int]])(using Quotes): Expr[Tuple] =
  import quotes.reflect.*


  val idxs = indices.valueOrAbort
  val tupleType = idxs
    .map(i => ConstantType(IntConstant(i)).asType)
    .foldRight[Type[? <: Tuple]](Type.of[EmptyTuple]):
      case ('[type i <: Int; i], '[type t <: Tuple; t]) =>
        Type.of[i *: t]
      case _ => report.errorAndAbort("Unhandled types expected")

  tupleType match
    case '[type t <: Tuple; t] =>
      '{ $tup.swizzle[t] }