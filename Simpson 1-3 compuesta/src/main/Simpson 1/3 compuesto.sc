def integraccion (a : Int, b : Int, n : Int, f : Double => Double): Double ={
  val j = n - 1
  val h = (a + b)/ n
  val x = a + (j*h)
  val calh = h /3
  val sumtoria = (f())
}