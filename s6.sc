def integracion (f: Double => Double,a: Double, b: Double ): Double = {
  val x: Double = (a + b) / 2
  (b - a) * (f(a) + 4 * f(x) + f(b) ) / 6
}


// Ejercicios

val i1 = (x:Double) => -Math.pow(x,2) + (8 * x) - 12
integracion(i1,3,5)

val i2 = (x:Double) => 3 * Math.pow(x,2)
integracion(i2,0,2)

val i3 = (x:Double) => (x + 2 * Math.pow(x,2) -Math.pow(x,3) + 5 * Math.pow(x,4))
integracion(i3,-1,1)

val i4 = (x:Double) => (2 * x + 1) / (Math.pow(x,2) + x)
integracion(i4,1,2)

val i5 = (x: Double) => Math.exp(x)
integracion(i5,0,1)

val i6 = (x:Double) =>  1 / Math.sqrt(x - 1)
integracion(i6,2,3)

val i7 = (x: Double) => 1 / (1 + Math.pow(x,2))
integracion(i7,0,1)


def error(vEsperado: Double, vObtenido: Double) = {
  Math.abs(vEsperado - vObtenido)
}

error(7.33, res0)
error(8, res1)
error(3.333, res2)
error(1.09861, res3)
error(1.71828, res4)
error(0.828427, res5)
error(0.785398, res6)