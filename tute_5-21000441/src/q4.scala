object q4 {
  def main(args: Array[String]): Unit = {
    check(3)
  }
  def check(n:Int):Unit={
      if(n%2==0){
        println ("EVEN")
      }else if(n%2==1) {

        println("ODD")
      }else if(n<1){
        check(-n)
      }else{
        check(n-2)
      }



  }
}
