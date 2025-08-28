package vectors.swizzling

object extensions:
  extension [T <: Tuple](tup: T)
    transparent inline def xx =
      tup.swiz[(0,0)]
    transparent inline def xy =
      tup.swiz[(0,1)]
    transparent inline def xz =
      tup.swiz[(0,2)]
    transparent inline def xw =
      tup.swiz[(0,3)]
    transparent inline def yx =
      tup.swiz[(1,0)]
    transparent inline def yy =
      tup.swiz[(1,1)]
    transparent inline def yz =
      tup.swiz[(1,2)]
    transparent inline def yw =
      tup.swiz[(1,3)]
    transparent inline def zx =
      tup.swiz[(2,0)]
    transparent inline def zy =
      tup.swiz[(2,1)]
    transparent inline def zz =
      tup.swiz[(2,2)]
    transparent inline def zw =
      tup.swiz[(2,3)]
    transparent inline def wx =
      tup.swiz[(3,0)]
    transparent inline def wy =
      tup.swiz[(3,1)]
    transparent inline def wz =
      tup.swiz[(3,2)]
    transparent inline def ww =
      tup.swiz[(3,3)]
    transparent inline def xxx =
      tup.swiz[(0,0,0)]
    transparent inline def xxy =
      tup.swiz[(0,0,1)]
    transparent inline def xxz =
      tup.swiz[(0,0,2)]
    transparent inline def xxw =
      tup.swiz[(0,0,3)]
    transparent inline def xyx =
      tup.swiz[(0,1,0)]
    transparent inline def xyy =
      tup.swiz[(0,1,1)]
    transparent inline def xyz =
      tup.swiz[(0,1,2)]
    transparent inline def xyw =
      tup.swiz[(0,1,3)]
    transparent inline def xzx =
      tup.swiz[(0,2,0)]
    transparent inline def xzy =
      tup.swiz[(0,2,1)]
    transparent inline def xzz =
      tup.swiz[(0,2,2)]
    transparent inline def xzw =
      tup.swiz[(0,2,3)]
    transparent inline def xwx =
      tup.swiz[(0,3,0)]
    transparent inline def xwy =
      tup.swiz[(0,3,1)]
    transparent inline def xwz =
      tup.swiz[(0,3,2)]
    transparent inline def xww =
      tup.swiz[(0,3,3)]
    transparent inline def yxx =
      tup.swiz[(1,0,0)]
    transparent inline def yxy =
      tup.swiz[(1,0,1)]
    transparent inline def yxz =
      tup.swiz[(1,0,2)]
    transparent inline def yxw =
      tup.swiz[(1,0,3)]
    transparent inline def yyx =
      tup.swiz[(1,1,0)]
    transparent inline def yyy =
      tup.swiz[(1,1,1)]
    transparent inline def yyz =
      tup.swiz[(1,1,2)]
    transparent inline def yyw =
      tup.swiz[(1,1,3)]
    transparent inline def yzx =
      tup.swiz[(1,2,0)]
    transparent inline def yzy =
      tup.swiz[(1,2,1)]
    transparent inline def yzz =
      tup.swiz[(1,2,2)]
    transparent inline def yzw =
      tup.swiz[(1,2,3)]
    transparent inline def ywx =
      tup.swiz[(1,3,0)]
    transparent inline def ywy =
      tup.swiz[(1,3,1)]
    transparent inline def ywz =
      tup.swiz[(1,3,2)]
    transparent inline def yww =
      tup.swiz[(1,3,3)]
    transparent inline def zxx =
      tup.swiz[(2,0,0)]
    transparent inline def zxy =
      tup.swiz[(2,0,1)]
    transparent inline def zxz =
      tup.swiz[(2,0,2)]
    transparent inline def zxw =
      tup.swiz[(2,0,3)]
    transparent inline def zyx =
      tup.swiz[(2,1,0)]
    transparent inline def zyy =
      tup.swiz[(2,1,1)]
    transparent inline def zyz =
      tup.swiz[(2,1,2)]
    transparent inline def zyw =
      tup.swiz[(2,1,3)]
    transparent inline def zzx =
      tup.swiz[(2,2,0)]
    transparent inline def zzy =
      tup.swiz[(2,2,1)]
    transparent inline def zzz =
      tup.swiz[(2,2,2)]
    transparent inline def zzw =
      tup.swiz[(2,2,3)]
    transparent inline def zwx =
      tup.swiz[(2,3,0)]
    transparent inline def zwy =
      tup.swiz[(2,3,1)]
    transparent inline def zwz =
      tup.swiz[(2,3,2)]
    transparent inline def zww =
      tup.swiz[(2,3,3)]
    transparent inline def wxx =
      tup.swiz[(3,0,0)]
    transparent inline def wxy =
      tup.swiz[(3,0,1)]
    transparent inline def wxz =
      tup.swiz[(3,0,2)]
    transparent inline def wxw =
      tup.swiz[(3,0,3)]
    transparent inline def wyx =
      tup.swiz[(3,1,0)]
    transparent inline def wyy =
      tup.swiz[(3,1,1)]
    transparent inline def wyz =
      tup.swiz[(3,1,2)]
    transparent inline def wyw =
      tup.swiz[(3,1,3)]
    transparent inline def wzx =
      tup.swiz[(3,2,0)]
    transparent inline def wzy =
      tup.swiz[(3,2,1)]
    transparent inline def wzz =
      tup.swiz[(3,2,2)]
    transparent inline def wzw =
      tup.swiz[(3,2,3)]
    transparent inline def wwx =
      tup.swiz[(3,3,0)]
    transparent inline def wwy =
      tup.swiz[(3,3,1)]
    transparent inline def wwz =
      tup.swiz[(3,3,2)]
    transparent inline def www =
      tup.swiz[(3,3,3)]
    transparent inline def xxxx =
      tup.swiz[(0,0,0,0)]
    transparent inline def xxxy =
      tup.swiz[(0,0,0,1)]
    transparent inline def xxxz =
      tup.swiz[(0,0,0,2)]
    transparent inline def xxxw =
      tup.swiz[(0,0,0,3)]
    transparent inline def xxyx =
      tup.swiz[(0,0,1,0)]
    transparent inline def xxyy =
      tup.swiz[(0,0,1,1)]
    transparent inline def xxyz =
      tup.swiz[(0,0,1,2)]
    transparent inline def xxyw =
      tup.swiz[(0,0,1,3)]
    transparent inline def xxzx =
      tup.swiz[(0,0,2,0)]
    transparent inline def xxzy =
      tup.swiz[(0,0,2,1)]
    transparent inline def xxzz =
      tup.swiz[(0,0,2,2)]
    transparent inline def xxzw =
      tup.swiz[(0,0,2,3)]
    transparent inline def xxwx =
      tup.swiz[(0,0,3,0)]
    transparent inline def xxwy =
      tup.swiz[(0,0,3,1)]
    transparent inline def xxwz =
      tup.swiz[(0,0,3,2)]
    transparent inline def xxww =
      tup.swiz[(0,0,3,3)]
    transparent inline def xyxx =
      tup.swiz[(0,1,0,0)]
    transparent inline def xyxy =
      tup.swiz[(0,1,0,1)]
    transparent inline def xyxz =
      tup.swiz[(0,1,0,2)]
    transparent inline def xyxw =
      tup.swiz[(0,1,0,3)]
    transparent inline def xyyx =
      tup.swiz[(0,1,1,0)]
    transparent inline def xyyy =
      tup.swiz[(0,1,1,1)]
    transparent inline def xyyz =
      tup.swiz[(0,1,1,2)]
    transparent inline def xyyw =
      tup.swiz[(0,1,1,3)]
    transparent inline def xyzx =
      tup.swiz[(0,1,2,0)]
    transparent inline def xyzy =
      tup.swiz[(0,1,2,1)]
    transparent inline def xyzz =
      tup.swiz[(0,1,2,2)]
    transparent inline def xyzw =
      tup.swiz[(0,1,2,3)]
    transparent inline def xywx =
      tup.swiz[(0,1,3,0)]
    transparent inline def xywy =
      tup.swiz[(0,1,3,1)]
    transparent inline def xywz =
      tup.swiz[(0,1,3,2)]
    transparent inline def xyww =
      tup.swiz[(0,1,3,3)]
    transparent inline def xzxx =
      tup.swiz[(0,2,0,0)]
    transparent inline def xzxy =
      tup.swiz[(0,2,0,1)]
    transparent inline def xzxz =
      tup.swiz[(0,2,0,2)]
    transparent inline def xzxw =
      tup.swiz[(0,2,0,3)]
    transparent inline def xzyx =
      tup.swiz[(0,2,1,0)]
    transparent inline def xzyy =
      tup.swiz[(0,2,1,1)]
    transparent inline def xzyz =
      tup.swiz[(0,2,1,2)]
    transparent inline def xzyw =
      tup.swiz[(0,2,1,3)]
    transparent inline def xzzx =
      tup.swiz[(0,2,2,0)]
    transparent inline def xzzy =
      tup.swiz[(0,2,2,1)]
    transparent inline def xzzz =
      tup.swiz[(0,2,2,2)]
    transparent inline def xzzw =
      tup.swiz[(0,2,2,3)]
    transparent inline def xzwx =
      tup.swiz[(0,2,3,0)]
    transparent inline def xzwy =
      tup.swiz[(0,2,3,1)]
    transparent inline def xzwz =
      tup.swiz[(0,2,3,2)]
    transparent inline def xzww =
      tup.swiz[(0,2,3,3)]
    transparent inline def xwxx =
      tup.swiz[(0,3,0,0)]
    transparent inline def xwxy =
      tup.swiz[(0,3,0,1)]
    transparent inline def xwxz =
      tup.swiz[(0,3,0,2)]
    transparent inline def xwxw =
      tup.swiz[(0,3,0,3)]
    transparent inline def xwyx =
      tup.swiz[(0,3,1,0)]
    transparent inline def xwyy =
      tup.swiz[(0,3,1,1)]
    transparent inline def xwyz =
      tup.swiz[(0,3,1,2)]
    transparent inline def xwyw =
      tup.swiz[(0,3,1,3)]
    transparent inline def xwzx =
      tup.swiz[(0,3,2,0)]
    transparent inline def xwzy =
      tup.swiz[(0,3,2,1)]
    transparent inline def xwzz =
      tup.swiz[(0,3,2,2)]
    transparent inline def xwzw =
      tup.swiz[(0,3,2,3)]
    transparent inline def xwwx =
      tup.swiz[(0,3,3,0)]
    transparent inline def xwwy =
      tup.swiz[(0,3,3,1)]
    transparent inline def xwwz =
      tup.swiz[(0,3,3,2)]
    transparent inline def xwww =
      tup.swiz[(0,3,3,3)]
    transparent inline def yxxx =
      tup.swiz[(1,0,0,0)]
    transparent inline def yxxy =
      tup.swiz[(1,0,0,1)]
    transparent inline def yxxz =
      tup.swiz[(1,0,0,2)]
    transparent inline def yxxw =
      tup.swiz[(1,0,0,3)]
    transparent inline def yxyx =
      tup.swiz[(1,0,1,0)]
    transparent inline def yxyy =
      tup.swiz[(1,0,1,1)]
    transparent inline def yxyz =
      tup.swiz[(1,0,1,2)]
    transparent inline def yxyw =
      tup.swiz[(1,0,1,3)]
    transparent inline def yxzx =
      tup.swiz[(1,0,2,0)]
    transparent inline def yxzy =
      tup.swiz[(1,0,2,1)]
    transparent inline def yxzz =
      tup.swiz[(1,0,2,2)]
    transparent inline def yxzw =
      tup.swiz[(1,0,2,3)]
    transparent inline def yxwx =
      tup.swiz[(1,0,3,0)]
    transparent inline def yxwy =
      tup.swiz[(1,0,3,1)]
    transparent inline def yxwz =
      tup.swiz[(1,0,3,2)]
    transparent inline def yxww =
      tup.swiz[(1,0,3,3)]
    transparent inline def yyxx =
      tup.swiz[(1,1,0,0)]
    transparent inline def yyxy =
      tup.swiz[(1,1,0,1)]
    transparent inline def yyxz =
      tup.swiz[(1,1,0,2)]
    transparent inline def yyxw =
      tup.swiz[(1,1,0,3)]
    transparent inline def yyyx =
      tup.swiz[(1,1,1,0)]
    transparent inline def yyyy =
      tup.swiz[(1,1,1,1)]
    transparent inline def yyyz =
      tup.swiz[(1,1,1,2)]
    transparent inline def yyyw =
      tup.swiz[(1,1,1,3)]
    transparent inline def yyzx =
      tup.swiz[(1,1,2,0)]
    transparent inline def yyzy =
      tup.swiz[(1,1,2,1)]
    transparent inline def yyzz =
      tup.swiz[(1,1,2,2)]
    transparent inline def yyzw =
      tup.swiz[(1,1,2,3)]
    transparent inline def yywx =
      tup.swiz[(1,1,3,0)]
    transparent inline def yywy =
      tup.swiz[(1,1,3,1)]
    transparent inline def yywz =
      tup.swiz[(1,1,3,2)]
    transparent inline def yyww =
      tup.swiz[(1,1,3,3)]
    transparent inline def yzxx =
      tup.swiz[(1,2,0,0)]
    transparent inline def yzxy =
      tup.swiz[(1,2,0,1)]
    transparent inline def yzxz =
      tup.swiz[(1,2,0,2)]
    transparent inline def yzxw =
      tup.swiz[(1,2,0,3)]
    transparent inline def yzyx =
      tup.swiz[(1,2,1,0)]
    transparent inline def yzyy =
      tup.swiz[(1,2,1,1)]
    transparent inline def yzyz =
      tup.swiz[(1,2,1,2)]
    transparent inline def yzyw =
      tup.swiz[(1,2,1,3)]
    transparent inline def yzzx =
      tup.swiz[(1,2,2,0)]
    transparent inline def yzzy =
      tup.swiz[(1,2,2,1)]
    transparent inline def yzzz =
      tup.swiz[(1,2,2,2)]
    transparent inline def yzzw =
      tup.swiz[(1,2,2,3)]
    transparent inline def yzwx =
      tup.swiz[(1,2,3,0)]
    transparent inline def yzwy =
      tup.swiz[(1,2,3,1)]
    transparent inline def yzwz =
      tup.swiz[(1,2,3,2)]
    transparent inline def yzww =
      tup.swiz[(1,2,3,3)]
    transparent inline def ywxx =
      tup.swiz[(1,3,0,0)]
    transparent inline def ywxy =
      tup.swiz[(1,3,0,1)]
    transparent inline def ywxz =
      tup.swiz[(1,3,0,2)]
    transparent inline def ywxw =
      tup.swiz[(1,3,0,3)]
    transparent inline def ywyx =
      tup.swiz[(1,3,1,0)]
    transparent inline def ywyy =
      tup.swiz[(1,3,1,1)]
    transparent inline def ywyz =
      tup.swiz[(1,3,1,2)]
    transparent inline def ywyw =
      tup.swiz[(1,3,1,3)]
    transparent inline def ywzx =
      tup.swiz[(1,3,2,0)]
    transparent inline def ywzy =
      tup.swiz[(1,3,2,1)]
    transparent inline def ywzz =
      tup.swiz[(1,3,2,2)]
    transparent inline def ywzw =
      tup.swiz[(1,3,2,3)]
    transparent inline def ywwx =
      tup.swiz[(1,3,3,0)]
    transparent inline def ywwy =
      tup.swiz[(1,3,3,1)]
    transparent inline def ywwz =
      tup.swiz[(1,3,3,2)]
    transparent inline def ywww =
      tup.swiz[(1,3,3,3)]
    transparent inline def zxxx =
      tup.swiz[(2,0,0,0)]
    transparent inline def zxxy =
      tup.swiz[(2,0,0,1)]
    transparent inline def zxxz =
      tup.swiz[(2,0,0,2)]
    transparent inline def zxxw =
      tup.swiz[(2,0,0,3)]
    transparent inline def zxyx =
      tup.swiz[(2,0,1,0)]
    transparent inline def zxyy =
      tup.swiz[(2,0,1,1)]
    transparent inline def zxyz =
      tup.swiz[(2,0,1,2)]
    transparent inline def zxyw =
      tup.swiz[(2,0,1,3)]
    transparent inline def zxzx =
      tup.swiz[(2,0,2,0)]
    transparent inline def zxzy =
      tup.swiz[(2,0,2,1)]
    transparent inline def zxzz =
      tup.swiz[(2,0,2,2)]
    transparent inline def zxzw =
      tup.swiz[(2,0,2,3)]
    transparent inline def zxwx =
      tup.swiz[(2,0,3,0)]
    transparent inline def zxwy =
      tup.swiz[(2,0,3,1)]
    transparent inline def zxwz =
      tup.swiz[(2,0,3,2)]
    transparent inline def zxww =
      tup.swiz[(2,0,3,3)]
    transparent inline def zyxx =
      tup.swiz[(2,1,0,0)]
    transparent inline def zyxy =
      tup.swiz[(2,1,0,1)]
    transparent inline def zyxz =
      tup.swiz[(2,1,0,2)]
    transparent inline def zyxw =
      tup.swiz[(2,1,0,3)]
    transparent inline def zyyx =
      tup.swiz[(2,1,1,0)]
    transparent inline def zyyy =
      tup.swiz[(2,1,1,1)]
    transparent inline def zyyz =
      tup.swiz[(2,1,1,2)]
    transparent inline def zyyw =
      tup.swiz[(2,1,1,3)]
    transparent inline def zyzx =
      tup.swiz[(2,1,2,0)]
    transparent inline def zyzy =
      tup.swiz[(2,1,2,1)]
    transparent inline def zyzz =
      tup.swiz[(2,1,2,2)]
    transparent inline def zyzw =
      tup.swiz[(2,1,2,3)]
    transparent inline def zywx =
      tup.swiz[(2,1,3,0)]
    transparent inline def zywy =
      tup.swiz[(2,1,3,1)]
    transparent inline def zywz =
      tup.swiz[(2,1,3,2)]
    transparent inline def zyww =
      tup.swiz[(2,1,3,3)]
    transparent inline def zzxx =
      tup.swiz[(2,2,0,0)]
    transparent inline def zzxy =
      tup.swiz[(2,2,0,1)]
    transparent inline def zzxz =
      tup.swiz[(2,2,0,2)]
    transparent inline def zzxw =
      tup.swiz[(2,2,0,3)]
    transparent inline def zzyx =
      tup.swiz[(2,2,1,0)]
    transparent inline def zzyy =
      tup.swiz[(2,2,1,1)]
    transparent inline def zzyz =
      tup.swiz[(2,2,1,2)]
    transparent inline def zzyw =
      tup.swiz[(2,2,1,3)]
    transparent inline def zzzx =
      tup.swiz[(2,2,2,0)]
    transparent inline def zzzy =
      tup.swiz[(2,2,2,1)]
    transparent inline def zzzz =
      tup.swiz[(2,2,2,2)]
    transparent inline def zzzw =
      tup.swiz[(2,2,2,3)]
    transparent inline def zzwx =
      tup.swiz[(2,2,3,0)]
    transparent inline def zzwy =
      tup.swiz[(2,2,3,1)]
    transparent inline def zzwz =
      tup.swiz[(2,2,3,2)]
    transparent inline def zzww =
      tup.swiz[(2,2,3,3)]
    transparent inline def zwxx =
      tup.swiz[(2,3,0,0)]
    transparent inline def zwxy =
      tup.swiz[(2,3,0,1)]
    transparent inline def zwxz =
      tup.swiz[(2,3,0,2)]
    transparent inline def zwxw =
      tup.swiz[(2,3,0,3)]
    transparent inline def zwyx =
      tup.swiz[(2,3,1,0)]
    transparent inline def zwyy =
      tup.swiz[(2,3,1,1)]
    transparent inline def zwyz =
      tup.swiz[(2,3,1,2)]
    transparent inline def zwyw =
      tup.swiz[(2,3,1,3)]
    transparent inline def zwzx =
      tup.swiz[(2,3,2,0)]
    transparent inline def zwzy =
      tup.swiz[(2,3,2,1)]
    transparent inline def zwzz =
      tup.swiz[(2,3,2,2)]
    transparent inline def zwzw =
      tup.swiz[(2,3,2,3)]
    transparent inline def zwwx =
      tup.swiz[(2,3,3,0)]
    transparent inline def zwwy =
      tup.swiz[(2,3,3,1)]
    transparent inline def zwwz =
      tup.swiz[(2,3,3,2)]
    transparent inline def zwww =
      tup.swiz[(2,3,3,3)]
    transparent inline def wxxx =
      tup.swiz[(3,0,0,0)]
    transparent inline def wxxy =
      tup.swiz[(3,0,0,1)]
    transparent inline def wxxz =
      tup.swiz[(3,0,0,2)]
    transparent inline def wxxw =
      tup.swiz[(3,0,0,3)]
    transparent inline def wxyx =
      tup.swiz[(3,0,1,0)]
    transparent inline def wxyy =
      tup.swiz[(3,0,1,1)]
    transparent inline def wxyz =
      tup.swiz[(3,0,1,2)]
    transparent inline def wxyw =
      tup.swiz[(3,0,1,3)]
    transparent inline def wxzx =
      tup.swiz[(3,0,2,0)]
    transparent inline def wxzy =
      tup.swiz[(3,0,2,1)]
    transparent inline def wxzz =
      tup.swiz[(3,0,2,2)]
    transparent inline def wxzw =
      tup.swiz[(3,0,2,3)]
    transparent inline def wxwx =
      tup.swiz[(3,0,3,0)]
    transparent inline def wxwy =
      tup.swiz[(3,0,3,1)]
    transparent inline def wxwz =
      tup.swiz[(3,0,3,2)]
    transparent inline def wxww =
      tup.swiz[(3,0,3,3)]
    transparent inline def wyxx =
      tup.swiz[(3,1,0,0)]
    transparent inline def wyxy =
      tup.swiz[(3,1,0,1)]
    transparent inline def wyxz =
      tup.swiz[(3,1,0,2)]
    transparent inline def wyxw =
      tup.swiz[(3,1,0,3)]
    transparent inline def wyyx =
      tup.swiz[(3,1,1,0)]
    transparent inline def wyyy =
      tup.swiz[(3,1,1,1)]
    transparent inline def wyyz =
      tup.swiz[(3,1,1,2)]
    transparent inline def wyyw =
      tup.swiz[(3,1,1,3)]
    transparent inline def wyzx =
      tup.swiz[(3,1,2,0)]
    transparent inline def wyzy =
      tup.swiz[(3,1,2,1)]
    transparent inline def wyzz =
      tup.swiz[(3,1,2,2)]
    transparent inline def wyzw =
      tup.swiz[(3,1,2,3)]
    transparent inline def wywx =
      tup.swiz[(3,1,3,0)]
    transparent inline def wywy =
      tup.swiz[(3,1,3,1)]
    transparent inline def wywz =
      tup.swiz[(3,1,3,2)]
    transparent inline def wyww =
      tup.swiz[(3,1,3,3)]
    transparent inline def wzxx =
      tup.swiz[(3,2,0,0)]
    transparent inline def wzxy =
      tup.swiz[(3,2,0,1)]
    transparent inline def wzxz =
      tup.swiz[(3,2,0,2)]
    transparent inline def wzxw =
      tup.swiz[(3,2,0,3)]
    transparent inline def wzyx =
      tup.swiz[(3,2,1,0)]
    transparent inline def wzyy =
      tup.swiz[(3,2,1,1)]
    transparent inline def wzyz =
      tup.swiz[(3,2,1,2)]
    transparent inline def wzyw =
      tup.swiz[(3,2,1,3)]
    transparent inline def wzzx =
      tup.swiz[(3,2,2,0)]
    transparent inline def wzzy =
      tup.swiz[(3,2,2,1)]
    transparent inline def wzzz =
      tup.swiz[(3,2,2,2)]
    transparent inline def wzzw =
      tup.swiz[(3,2,2,3)]
    transparent inline def wzwx =
      tup.swiz[(3,2,3,0)]
    transparent inline def wzwy =
      tup.swiz[(3,2,3,1)]
    transparent inline def wzwz =
      tup.swiz[(3,2,3,2)]
    transparent inline def wzww =
      tup.swiz[(3,2,3,3)]
    transparent inline def wwxx =
      tup.swiz[(3,3,0,0)]
    transparent inline def wwxy =
      tup.swiz[(3,3,0,1)]
    transparent inline def wwxz =
      tup.swiz[(3,3,0,2)]
    transparent inline def wwxw =
      tup.swiz[(3,3,0,3)]
    transparent inline def wwyx =
      tup.swiz[(3,3,1,0)]
    transparent inline def wwyy =
      tup.swiz[(3,3,1,1)]
    transparent inline def wwyz =
      tup.swiz[(3,3,1,2)]
    transparent inline def wwyw =
      tup.swiz[(3,3,1,3)]
    transparent inline def wwzx =
      tup.swiz[(3,3,2,0)]
    transparent inline def wwzy =
      tup.swiz[(3,3,2,1)]
    transparent inline def wwzz =
      tup.swiz[(3,3,2,2)]
    transparent inline def wwzw =
      tup.swiz[(3,3,2,3)]
    transparent inline def wwwx =
      tup.swiz[(3,3,3,0)]
    transparent inline def wwwy =
      tup.swiz[(3,3,3,1)]
    transparent inline def wwwz =
      tup.swiz[(3,3,3,2)]
    transparent inline def wwww =
      tup.swiz[(3,3,3,3)]
    transparent inline def rr =
      tup.swiz[(0,0)]
    transparent inline def rg =
      tup.swiz[(0,1)]
    transparent inline def rb =
      tup.swiz[(0,2)]
    transparent inline def ra =
      tup.swiz[(0,3)]
    transparent inline def gr =
      tup.swiz[(1,0)]
    transparent inline def gg =
      tup.swiz[(1,1)]
    transparent inline def gb =
      tup.swiz[(1,2)]
    transparent inline def ga =
      tup.swiz[(1,3)]
    transparent inline def br =
      tup.swiz[(2,0)]
    transparent inline def bg =
      tup.swiz[(2,1)]
    transparent inline def bb =
      tup.swiz[(2,2)]
    transparent inline def ba =
      tup.swiz[(2,3)]
    transparent inline def ar =
      tup.swiz[(3,0)]
    transparent inline def ag =
      tup.swiz[(3,1)]
    transparent inline def ab =
      tup.swiz[(3,2)]
    transparent inline def aa =
      tup.swiz[(3,3)]
    transparent inline def rrr =
      tup.swiz[(0,0,0)]
    transparent inline def rrg =
      tup.swiz[(0,0,1)]
    transparent inline def rrb =
      tup.swiz[(0,0,2)]
    transparent inline def rra =
      tup.swiz[(0,0,3)]
    transparent inline def rgr =
      tup.swiz[(0,1,0)]
    transparent inline def rgg =
      tup.swiz[(0,1,1)]
    transparent inline def rgb =
      tup.swiz[(0,1,2)]
    transparent inline def rga =
      tup.swiz[(0,1,3)]
    transparent inline def rbr =
      tup.swiz[(0,2,0)]
    transparent inline def rbg =
      tup.swiz[(0,2,1)]
    transparent inline def rbb =
      tup.swiz[(0,2,2)]
    transparent inline def rba =
      tup.swiz[(0,2,3)]
    transparent inline def rar =
      tup.swiz[(0,3,0)]
    transparent inline def rag =
      tup.swiz[(0,3,1)]
    transparent inline def rab =
      tup.swiz[(0,3,2)]
    transparent inline def raa =
      tup.swiz[(0,3,3)]
    transparent inline def grr =
      tup.swiz[(1,0,0)]
    transparent inline def grg =
      tup.swiz[(1,0,1)]
    transparent inline def grb =
      tup.swiz[(1,0,2)]
    transparent inline def gra =
      tup.swiz[(1,0,3)]
    transparent inline def ggr =
      tup.swiz[(1,1,0)]
    transparent inline def ggg =
      tup.swiz[(1,1,1)]
    transparent inline def ggb =
      tup.swiz[(1,1,2)]
    transparent inline def gga =
      tup.swiz[(1,1,3)]
    transparent inline def gbr =
      tup.swiz[(1,2,0)]
    transparent inline def gbg =
      tup.swiz[(1,2,1)]
    transparent inline def gbb =
      tup.swiz[(1,2,2)]
    transparent inline def gba =
      tup.swiz[(1,2,3)]
    transparent inline def gar =
      tup.swiz[(1,3,0)]
    transparent inline def gag =
      tup.swiz[(1,3,1)]
    transparent inline def gab =
      tup.swiz[(1,3,2)]
    transparent inline def gaa =
      tup.swiz[(1,3,3)]
    transparent inline def brr =
      tup.swiz[(2,0,0)]
    transparent inline def brg =
      tup.swiz[(2,0,1)]
    transparent inline def brb =
      tup.swiz[(2,0,2)]
    transparent inline def bra =
      tup.swiz[(2,0,3)]
    transparent inline def bgr =
      tup.swiz[(2,1,0)]
    transparent inline def bgg =
      tup.swiz[(2,1,1)]
    transparent inline def bgb =
      tup.swiz[(2,1,2)]
    transparent inline def bga =
      tup.swiz[(2,1,3)]
    transparent inline def bbr =
      tup.swiz[(2,2,0)]
    transparent inline def bbg =
      tup.swiz[(2,2,1)]
    transparent inline def bbb =
      tup.swiz[(2,2,2)]
    transparent inline def bba =
      tup.swiz[(2,2,3)]
    transparent inline def bar =
      tup.swiz[(2,3,0)]
    transparent inline def bag =
      tup.swiz[(2,3,1)]
    transparent inline def bab =
      tup.swiz[(2,3,2)]
    transparent inline def baa =
      tup.swiz[(2,3,3)]
    transparent inline def arr =
      tup.swiz[(3,0,0)]
    transparent inline def arg =
      tup.swiz[(3,0,1)]
    transparent inline def arb =
      tup.swiz[(3,0,2)]
    transparent inline def ara =
      tup.swiz[(3,0,3)]
    transparent inline def agr =
      tup.swiz[(3,1,0)]
    transparent inline def agg =
      tup.swiz[(3,1,1)]
    transparent inline def agb =
      tup.swiz[(3,1,2)]
    transparent inline def aga =
      tup.swiz[(3,1,3)]
    transparent inline def abr =
      tup.swiz[(3,2,0)]
    transparent inline def abg =
      tup.swiz[(3,2,1)]
    transparent inline def abb =
      tup.swiz[(3,2,2)]
    transparent inline def aba =
      tup.swiz[(3,2,3)]
    transparent inline def aar =
      tup.swiz[(3,3,0)]
    transparent inline def aag =
      tup.swiz[(3,3,1)]
    transparent inline def aab =
      tup.swiz[(3,3,2)]
    transparent inline def aaa =
      tup.swiz[(3,3,3)]
    transparent inline def rrrr =
      tup.swiz[(0,0,0,0)]
    transparent inline def rrrg =
      tup.swiz[(0,0,0,1)]
    transparent inline def rrrb =
      tup.swiz[(0,0,0,2)]
    transparent inline def rrra =
      tup.swiz[(0,0,0,3)]
    transparent inline def rrgr =
      tup.swiz[(0,0,1,0)]
    transparent inline def rrgg =
      tup.swiz[(0,0,1,1)]
    transparent inline def rrgb =
      tup.swiz[(0,0,1,2)]
    transparent inline def rrga =
      tup.swiz[(0,0,1,3)]
    transparent inline def rrbr =
      tup.swiz[(0,0,2,0)]
    transparent inline def rrbg =
      tup.swiz[(0,0,2,1)]
    transparent inline def rrbb =
      tup.swiz[(0,0,2,2)]
    transparent inline def rrba =
      tup.swiz[(0,0,2,3)]
    transparent inline def rrar =
      tup.swiz[(0,0,3,0)]
    transparent inline def rrag =
      tup.swiz[(0,0,3,1)]
    transparent inline def rrab =
      tup.swiz[(0,0,3,2)]
    transparent inline def rraa =
      tup.swiz[(0,0,3,3)]
    transparent inline def rgrr =
      tup.swiz[(0,1,0,0)]
    transparent inline def rgrg =
      tup.swiz[(0,1,0,1)]
    transparent inline def rgrb =
      tup.swiz[(0,1,0,2)]
    transparent inline def rgra =
      tup.swiz[(0,1,0,3)]
    transparent inline def rggr =
      tup.swiz[(0,1,1,0)]
    transparent inline def rggg =
      tup.swiz[(0,1,1,1)]
    transparent inline def rggb =
      tup.swiz[(0,1,1,2)]
    transparent inline def rgga =
      tup.swiz[(0,1,1,3)]
    transparent inline def rgbr =
      tup.swiz[(0,1,2,0)]
    transparent inline def rgbg =
      tup.swiz[(0,1,2,1)]
    transparent inline def rgbb =
      tup.swiz[(0,1,2,2)]
    transparent inline def rgba =
      tup.swiz[(0,1,2,3)]
    transparent inline def rgar =
      tup.swiz[(0,1,3,0)]
    transparent inline def rgag =
      tup.swiz[(0,1,3,1)]
    transparent inline def rgab =
      tup.swiz[(0,1,3,2)]
    transparent inline def rgaa =
      tup.swiz[(0,1,3,3)]
    transparent inline def rbrr =
      tup.swiz[(0,2,0,0)]
    transparent inline def rbrg =
      tup.swiz[(0,2,0,1)]
    transparent inline def rbrb =
      tup.swiz[(0,2,0,2)]
    transparent inline def rbra =
      tup.swiz[(0,2,0,3)]
    transparent inline def rbgr =
      tup.swiz[(0,2,1,0)]
    transparent inline def rbgg =
      tup.swiz[(0,2,1,1)]
    transparent inline def rbgb =
      tup.swiz[(0,2,1,2)]
    transparent inline def rbga =
      tup.swiz[(0,2,1,3)]
    transparent inline def rbbr =
      tup.swiz[(0,2,2,0)]
    transparent inline def rbbg =
      tup.swiz[(0,2,2,1)]
    transparent inline def rbbb =
      tup.swiz[(0,2,2,2)]
    transparent inline def rbba =
      tup.swiz[(0,2,2,3)]
    transparent inline def rbar =
      tup.swiz[(0,2,3,0)]
    transparent inline def rbag =
      tup.swiz[(0,2,3,1)]
    transparent inline def rbab =
      tup.swiz[(0,2,3,2)]
    transparent inline def rbaa =
      tup.swiz[(0,2,3,3)]
    transparent inline def rarr =
      tup.swiz[(0,3,0,0)]
    transparent inline def rarg =
      tup.swiz[(0,3,0,1)]
    transparent inline def rarb =
      tup.swiz[(0,3,0,2)]
    transparent inline def rara =
      tup.swiz[(0,3,0,3)]
    transparent inline def ragr =
      tup.swiz[(0,3,1,0)]
    transparent inline def ragg =
      tup.swiz[(0,3,1,1)]
    transparent inline def ragb =
      tup.swiz[(0,3,1,2)]
    transparent inline def raga =
      tup.swiz[(0,3,1,3)]
    transparent inline def rabr =
      tup.swiz[(0,3,2,0)]
    transparent inline def rabg =
      tup.swiz[(0,3,2,1)]
    transparent inline def rabb =
      tup.swiz[(0,3,2,2)]
    transparent inline def raba =
      tup.swiz[(0,3,2,3)]
    transparent inline def raar =
      tup.swiz[(0,3,3,0)]
    transparent inline def raag =
      tup.swiz[(0,3,3,1)]
    transparent inline def raab =
      tup.swiz[(0,3,3,2)]
    transparent inline def raaa =
      tup.swiz[(0,3,3,3)]
    transparent inline def grrr =
      tup.swiz[(1,0,0,0)]
    transparent inline def grrg =
      tup.swiz[(1,0,0,1)]
    transparent inline def grrb =
      tup.swiz[(1,0,0,2)]
    transparent inline def grra =
      tup.swiz[(1,0,0,3)]
    transparent inline def grgr =
      tup.swiz[(1,0,1,0)]
    transparent inline def grgg =
      tup.swiz[(1,0,1,1)]
    transparent inline def grgb =
      tup.swiz[(1,0,1,2)]
    transparent inline def grga =
      tup.swiz[(1,0,1,3)]
    transparent inline def grbr =
      tup.swiz[(1,0,2,0)]
    transparent inline def grbg =
      tup.swiz[(1,0,2,1)]
    transparent inline def grbb =
      tup.swiz[(1,0,2,2)]
    transparent inline def grba =
      tup.swiz[(1,0,2,3)]
    transparent inline def grar =
      tup.swiz[(1,0,3,0)]
    transparent inline def grag =
      tup.swiz[(1,0,3,1)]
    transparent inline def grab =
      tup.swiz[(1,0,3,2)]
    transparent inline def graa =
      tup.swiz[(1,0,3,3)]
    transparent inline def ggrr =
      tup.swiz[(1,1,0,0)]
    transparent inline def ggrg =
      tup.swiz[(1,1,0,1)]
    transparent inline def ggrb =
      tup.swiz[(1,1,0,2)]
    transparent inline def ggra =
      tup.swiz[(1,1,0,3)]
    transparent inline def gggr =
      tup.swiz[(1,1,1,0)]
    transparent inline def gggg =
      tup.swiz[(1,1,1,1)]
    transparent inline def gggb =
      tup.swiz[(1,1,1,2)]
    transparent inline def ggga =
      tup.swiz[(1,1,1,3)]
    transparent inline def ggbr =
      tup.swiz[(1,1,2,0)]
    transparent inline def ggbg =
      tup.swiz[(1,1,2,1)]
    transparent inline def ggbb =
      tup.swiz[(1,1,2,2)]
    transparent inline def ggba =
      tup.swiz[(1,1,2,3)]
    transparent inline def ggar =
      tup.swiz[(1,1,3,0)]
    transparent inline def ggag =
      tup.swiz[(1,1,3,1)]
    transparent inline def ggab =
      tup.swiz[(1,1,3,2)]
    transparent inline def ggaa =
      tup.swiz[(1,1,3,3)]
    transparent inline def gbrr =
      tup.swiz[(1,2,0,0)]
    transparent inline def gbrg =
      tup.swiz[(1,2,0,1)]
    transparent inline def gbrb =
      tup.swiz[(1,2,0,2)]
    transparent inline def gbra =
      tup.swiz[(1,2,0,3)]
    transparent inline def gbgr =
      tup.swiz[(1,2,1,0)]
    transparent inline def gbgg =
      tup.swiz[(1,2,1,1)]
    transparent inline def gbgb =
      tup.swiz[(1,2,1,2)]
    transparent inline def gbga =
      tup.swiz[(1,2,1,3)]
    transparent inline def gbbr =
      tup.swiz[(1,2,2,0)]
    transparent inline def gbbg =
      tup.swiz[(1,2,2,1)]
    transparent inline def gbbb =
      tup.swiz[(1,2,2,2)]
    transparent inline def gbba =
      tup.swiz[(1,2,2,3)]
    transparent inline def gbar =
      tup.swiz[(1,2,3,0)]
    transparent inline def gbag =
      tup.swiz[(1,2,3,1)]
    transparent inline def gbab =
      tup.swiz[(1,2,3,2)]
    transparent inline def gbaa =
      tup.swiz[(1,2,3,3)]
    transparent inline def garr =
      tup.swiz[(1,3,0,0)]
    transparent inline def garg =
      tup.swiz[(1,3,0,1)]
    transparent inline def garb =
      tup.swiz[(1,3,0,2)]
    transparent inline def gara =
      tup.swiz[(1,3,0,3)]
    transparent inline def gagr =
      tup.swiz[(1,3,1,0)]
    transparent inline def gagg =
      tup.swiz[(1,3,1,1)]
    transparent inline def gagb =
      tup.swiz[(1,3,1,2)]
    transparent inline def gaga =
      tup.swiz[(1,3,1,3)]
    transparent inline def gabr =
      tup.swiz[(1,3,2,0)]
    transparent inline def gabg =
      tup.swiz[(1,3,2,1)]
    transparent inline def gabb =
      tup.swiz[(1,3,2,2)]
    transparent inline def gaba =
      tup.swiz[(1,3,2,3)]
    transparent inline def gaar =
      tup.swiz[(1,3,3,0)]
    transparent inline def gaag =
      tup.swiz[(1,3,3,1)]
    transparent inline def gaab =
      tup.swiz[(1,3,3,2)]
    transparent inline def gaaa =
      tup.swiz[(1,3,3,3)]
    transparent inline def brrr =
      tup.swiz[(2,0,0,0)]
    transparent inline def brrg =
      tup.swiz[(2,0,0,1)]
    transparent inline def brrb =
      tup.swiz[(2,0,0,2)]
    transparent inline def brra =
      tup.swiz[(2,0,0,3)]
    transparent inline def brgr =
      tup.swiz[(2,0,1,0)]
    transparent inline def brgg =
      tup.swiz[(2,0,1,1)]
    transparent inline def brgb =
      tup.swiz[(2,0,1,2)]
    transparent inline def brga =
      tup.swiz[(2,0,1,3)]
    transparent inline def brbr =
      tup.swiz[(2,0,2,0)]
    transparent inline def brbg =
      tup.swiz[(2,0,2,1)]
    transparent inline def brbb =
      tup.swiz[(2,0,2,2)]
    transparent inline def brba =
      tup.swiz[(2,0,2,3)]
    transparent inline def brar =
      tup.swiz[(2,0,3,0)]
    transparent inline def brag =
      tup.swiz[(2,0,3,1)]
    transparent inline def brab =
      tup.swiz[(2,0,3,2)]
    transparent inline def braa =
      tup.swiz[(2,0,3,3)]
    transparent inline def bgrr =
      tup.swiz[(2,1,0,0)]
    transparent inline def bgrg =
      tup.swiz[(2,1,0,1)]
    transparent inline def bgrb =
      tup.swiz[(2,1,0,2)]
    transparent inline def bgra =
      tup.swiz[(2,1,0,3)]
    transparent inline def bggr =
      tup.swiz[(2,1,1,0)]
    transparent inline def bggg =
      tup.swiz[(2,1,1,1)]
    transparent inline def bggb =
      tup.swiz[(2,1,1,2)]
    transparent inline def bgga =
      tup.swiz[(2,1,1,3)]
    transparent inline def bgbr =
      tup.swiz[(2,1,2,0)]
    transparent inline def bgbg =
      tup.swiz[(2,1,2,1)]
    transparent inline def bgbb =
      tup.swiz[(2,1,2,2)]
    transparent inline def bgba =
      tup.swiz[(2,1,2,3)]
    transparent inline def bgar =
      tup.swiz[(2,1,3,0)]
    transparent inline def bgag =
      tup.swiz[(2,1,3,1)]
    transparent inline def bgab =
      tup.swiz[(2,1,3,2)]
    transparent inline def bgaa =
      tup.swiz[(2,1,3,3)]
    transparent inline def bbrr =
      tup.swiz[(2,2,0,0)]
    transparent inline def bbrg =
      tup.swiz[(2,2,0,1)]
    transparent inline def bbrb =
      tup.swiz[(2,2,0,2)]
    transparent inline def bbra =
      tup.swiz[(2,2,0,3)]
    transparent inline def bbgr =
      tup.swiz[(2,2,1,0)]
    transparent inline def bbgg =
      tup.swiz[(2,2,1,1)]
    transparent inline def bbgb =
      tup.swiz[(2,2,1,2)]
    transparent inline def bbga =
      tup.swiz[(2,2,1,3)]
    transparent inline def bbbr =
      tup.swiz[(2,2,2,0)]
    transparent inline def bbbg =
      tup.swiz[(2,2,2,1)]
    transparent inline def bbbb =
      tup.swiz[(2,2,2,2)]
    transparent inline def bbba =
      tup.swiz[(2,2,2,3)]
    transparent inline def bbar =
      tup.swiz[(2,2,3,0)]
    transparent inline def bbag =
      tup.swiz[(2,2,3,1)]
    transparent inline def bbab =
      tup.swiz[(2,2,3,2)]
    transparent inline def bbaa =
      tup.swiz[(2,2,3,3)]
    transparent inline def barr =
      tup.swiz[(2,3,0,0)]
    transparent inline def barg =
      tup.swiz[(2,3,0,1)]
    transparent inline def barb =
      tup.swiz[(2,3,0,2)]
    transparent inline def bara =
      tup.swiz[(2,3,0,3)]
    transparent inline def bagr =
      tup.swiz[(2,3,1,0)]
    transparent inline def bagg =
      tup.swiz[(2,3,1,1)]
    transparent inline def bagb =
      tup.swiz[(2,3,1,2)]
    transparent inline def baga =
      tup.swiz[(2,3,1,3)]
    transparent inline def babr =
      tup.swiz[(2,3,2,0)]
    transparent inline def babg =
      tup.swiz[(2,3,2,1)]
    transparent inline def babb =
      tup.swiz[(2,3,2,2)]
    transparent inline def baba =
      tup.swiz[(2,3,2,3)]
    transparent inline def baar =
      tup.swiz[(2,3,3,0)]
    transparent inline def baag =
      tup.swiz[(2,3,3,1)]
    transparent inline def baab =
      tup.swiz[(2,3,3,2)]
    transparent inline def baaa =
      tup.swiz[(2,3,3,3)]
    transparent inline def arrr =
      tup.swiz[(3,0,0,0)]
    transparent inline def arrg =
      tup.swiz[(3,0,0,1)]
    transparent inline def arrb =
      tup.swiz[(3,0,0,2)]
    transparent inline def arra =
      tup.swiz[(3,0,0,3)]
    transparent inline def argr =
      tup.swiz[(3,0,1,0)]
    transparent inline def argg =
      tup.swiz[(3,0,1,1)]
    transparent inline def argb =
      tup.swiz[(3,0,1,2)]
    transparent inline def arga =
      tup.swiz[(3,0,1,3)]
    transparent inline def arbr =
      tup.swiz[(3,0,2,0)]
    transparent inline def arbg =
      tup.swiz[(3,0,2,1)]
    transparent inline def arbb =
      tup.swiz[(3,0,2,2)]
    transparent inline def arba =
      tup.swiz[(3,0,2,3)]
    transparent inline def arar =
      tup.swiz[(3,0,3,0)]
    transparent inline def arag =
      tup.swiz[(3,0,3,1)]
    transparent inline def arab =
      tup.swiz[(3,0,3,2)]
    transparent inline def araa =
      tup.swiz[(3,0,3,3)]
    transparent inline def agrr =
      tup.swiz[(3,1,0,0)]
    transparent inline def agrg =
      tup.swiz[(3,1,0,1)]
    transparent inline def agrb =
      tup.swiz[(3,1,0,2)]
    transparent inline def agra =
      tup.swiz[(3,1,0,3)]
    transparent inline def aggr =
      tup.swiz[(3,1,1,0)]
    transparent inline def aggg =
      tup.swiz[(3,1,1,1)]
    transparent inline def aggb =
      tup.swiz[(3,1,1,2)]
    transparent inline def agga =
      tup.swiz[(3,1,1,3)]
    transparent inline def agbr =
      tup.swiz[(3,1,2,0)]
    transparent inline def agbg =
      tup.swiz[(3,1,2,1)]
    transparent inline def agbb =
      tup.swiz[(3,1,2,2)]
    transparent inline def agba =
      tup.swiz[(3,1,2,3)]
    transparent inline def agar =
      tup.swiz[(3,1,3,0)]
    transparent inline def agag =
      tup.swiz[(3,1,3,1)]
    transparent inline def agab =
      tup.swiz[(3,1,3,2)]
    transparent inline def agaa =
      tup.swiz[(3,1,3,3)]
    transparent inline def abrr =
      tup.swiz[(3,2,0,0)]
    transparent inline def abrg =
      tup.swiz[(3,2,0,1)]
    transparent inline def abrb =
      tup.swiz[(3,2,0,2)]
    transparent inline def abra =
      tup.swiz[(3,2,0,3)]
    transparent inline def abgr =
      tup.swiz[(3,2,1,0)]
    transparent inline def abgg =
      tup.swiz[(3,2,1,1)]
    transparent inline def abgb =
      tup.swiz[(3,2,1,2)]
    transparent inline def abga =
      tup.swiz[(3,2,1,3)]
    transparent inline def abbr =
      tup.swiz[(3,2,2,0)]
    transparent inline def abbg =
      tup.swiz[(3,2,2,1)]
    transparent inline def abbb =
      tup.swiz[(3,2,2,2)]
    transparent inline def abba =
      tup.swiz[(3,2,2,3)]
    transparent inline def abar =
      tup.swiz[(3,2,3,0)]
    transparent inline def abag =
      tup.swiz[(3,2,3,1)]
    transparent inline def abab =
      tup.swiz[(3,2,3,2)]
    transparent inline def abaa =
      tup.swiz[(3,2,3,3)]
    transparent inline def aarr =
      tup.swiz[(3,3,0,0)]
    transparent inline def aarg =
      tup.swiz[(3,3,0,1)]
    transparent inline def aarb =
      tup.swiz[(3,3,0,2)]
    transparent inline def aara =
      tup.swiz[(3,3,0,3)]
    transparent inline def aagr =
      tup.swiz[(3,3,1,0)]
    transparent inline def aagg =
      tup.swiz[(3,3,1,1)]
    transparent inline def aagb =
      tup.swiz[(3,3,1,2)]
    transparent inline def aaga =
      tup.swiz[(3,3,1,3)]
    transparent inline def aabr =
      tup.swiz[(3,3,2,0)]
    transparent inline def aabg =
      tup.swiz[(3,3,2,1)]
    transparent inline def aabb =
      tup.swiz[(3,3,2,2)]
    transparent inline def aaba =
      tup.swiz[(3,3,2,3)]
    transparent inline def aaar =
      tup.swiz[(3,3,3,0)]
    transparent inline def aaag =
      tup.swiz[(3,3,3,1)]
    transparent inline def aaab =
      tup.swiz[(3,3,3,2)]
    transparent inline def aaaa =
      tup.swiz[(3,3,3,3)]
  end extension
end extensions
  
