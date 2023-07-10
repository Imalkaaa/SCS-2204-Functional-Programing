object q6 {
  def main(args: Array[String]): Unit = {
    (fibseq(5))
  }
  def fib(n:Int):Int=n match{
    case 0  => 0
    case x if x==1 => 1
    case _ => fib(n-1)+fib(n-2)

}
def fibseq(n:Int):Unit= {
  if (n > 0) fibseq(n - 1)
  println(fib(n))
}
}
