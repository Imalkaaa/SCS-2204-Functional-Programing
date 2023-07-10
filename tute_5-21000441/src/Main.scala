object Main {
  def main(args: Array[String]): Unit = {

      println(prime(7))

  }
  def prime(a:Int,b:Int=2) : Boolean =b match {

    case x if(a==x) => true
    case x if GCD(a,x)>1 => false
    case x => prime(a,x+1)

  }
  def GCD(a:Int,b:Int) :Int =b match{
    case 0 =>a
    case x if x>a => GCD(x,a)
    case x=> GCD(x,a%x)
  }
}