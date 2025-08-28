type PermData = (name: String, indices: Tuple)

def perms(s: String, len: Int): Seq[PermData] =
  assert(len >= 0)
  if len > 0 then
    s.zipWithIndex.flatMap((c, i) =>
      perms(s, len - 1).map(p => (s"$c${p.name}", i *: p.indices))
    )
  else Seq(("", EmptyTuple))

def perms(s: String, range: Range): Seq[PermData] =
  range.flatMap(perms(s, _))

val xyzwPerms = perms("xyzw", 2 to 4)
val rgbaPerms = perms("rgba", 2 to 4)
val allPerms = xyzwPerms ++ rgbaPerms

def methodOf(data: PermData): String =
  val (name, indices) = data
  s"""    transparent inline def $name =
     |      tup.swiz[$indices]""".stripMargin
val `package` = "package vectors.swizzling"
val begin =
  """object extensions:
     |  extension [T <: Tuple](tup: T)""".stripMargin
val end =
  """  end extension
    |end extensions
  """.stripMargin

val allMethods = allPerms.map(methodOf)
val finalString =
  s"""${`package`}
     |
     |$begin
     |${allMethods.mkString("\n")}
     |$end""".stripMargin

@main def main = println(finalString)