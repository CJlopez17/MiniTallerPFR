def simpsonCom(f : Double => Double, down : Int, up : Double, interval : Int) : Double = {
  val h = ((up - down) * 1.0) / interval
  val xj = (j : Double) => down + ((j * h)* 1.0)
  val f1 = (j : Double) =>  f(xj((2 * j) - 2)) + (4 * f(xj((2 * j) - 1))) + f(xj(2 * j))
  val sumatoria = (1 to interval / 2).map(f1(_)).sum
  (sumatoria * h) / 3
}

def simpsonExt (f : Double => Double, down : Int, up : Int): Double = {
  val n = 2 * (up - down)
  val h = (up - down) / n.toDouble
  val func1 = (x: Double) => f(down + (x * h))
  val funciones = f(down) + 4 * (1 until n by 2).map(func1(_)).sum +
    2 * (2 to n - 2 by 2).map(func1(_)).sum + f(up)
  (funciones * h) / 30
}

