package vectors

import scala.compiletime.{erasedValue, constValue}
import scala.compiletime.ops.int.S

type Swizzle[T <: Tuple, Indices <: Tuple] <: Tuple =
  Indices match
    case EmptyTuple => EmptyTuple
    case 0 *: xs => Tuple.Elem[T, 0] *: Swizzle[T, xs]
    case S[n] *: xs => Tuple.Elem[T, S[n]] *: Swizzle[T, xs]

extension [T <: Tuple](inline tup: T)
  inline def swizzle[I <: Tuple]: Swizzle[T, I] =
    inline erasedValue[I] match
      case _: EmptyTuple => EmptyTuple
      case _: (0 *: xs) => tup(0) *: tup.swizzle[xs]
      case _: (S[x] *: xs) => tup(constValue[S[x]]) *: tup.swizzle[xs]