object q5 {
  def main(args: Array[String]): Unit = {
    println(sum(3))
  }
  def sum(n:Int):Int={
    if (n <= 0) {
      0}
    else if(n%2==0){
      n+sum(n-1)
    }else{
      sum(n-1)
    }
  }
}
