object q3 {
  def main(args: Array[String]): Unit = {
    print(sum(13))
  }
  def sum(n:Int):Int={
    if(n<=0){
      0
    }else{
      n+sum(n-1)
    }
  }
}
