def simpson13(b : Int, a : Int, f : Double => Double): Double ={
  val h = b - a
  val x = (a+b)/2.0
  val denominador = (f(a)+ 4 * f(x)+ f(b)) /6
  h * denominador
}

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
  (funciones * h) / 3.0
}
def errorCal (t : Double, e : Double): Double = math.abs(t-e)

//Ejemplo 1
def f1 (x:Double) = Math.pow(-x,2) + (8 * x) - 12
simpson13(3,5,f1)
simpsonCom(f1, 3, 5, 2)
simpsonExt(f1,5,3)

//Ejemplo 2
def f2 (x : Double) = 3 * math.pow(x,2)
simpson13(0,2,f2)
simpsonCom(f2, 0 , 3, 8)
simpsonExt(f2, 0, 2)

//Ejemplo 3
def f3(x:Double) = x + 2 * math.pow(x,2) - math.pow(x,3) + 5 * math.pow(x,4)
simpson13(-1, 1, f3)
simpsonCom(f3, -1, 1, 3)
simpsonExt(f3, -1, 1)

//Ejemplo 4
def f4(x:Double) = (2*x + 1)/(math.pow(x,2)+x)
simpson13(1, 2, f4)
simpsonCom(f4, 1, 2, 1)
simpsonExt(f4, 1, 2)

//Ejemplo 5
def f5(x:Double) = math.exp(x)
simpson13(0, 1, f5)
simpsonCom(f5, 0, 1, 1)
simpsonExt(f5, 0, 1)

//Ejemplo 6
def f6(x:Double) = 1 / (math.sqrt(x -1))
simpson13(2, 3, f6)
simpsonCom(f6, 2, 3, 0)
simpsonExt(f6, 2, 3)

//Ejemplo 7
def f7(x: Double) = 1 / (1 + math.pow(x,2))
simpson13(0, 1, f7)
simpsonCom(f7, 0, 1, 0)
simpsonExt(f7, 0, 1)
