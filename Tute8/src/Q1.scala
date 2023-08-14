import scala.io.StdIn

object Q1 {
  def main(args: Array[String]): Unit = {
    println("Enter the deposit amount: ")
    val deposit = scala.io.StdIn.readDouble()
    val interest = findInterest(deposit)
    println(s"Interest = $interest")
  }

  val findInterest: Double => Double = deposit => {
    deposit match {
      case x if x <= 20000 => x * 0.02
      case x if x <= 200000 => x * 0.04
      case x if x <= 2000000 => x * 0.035
      case _ => deposit * 0.065
    }
  }
}
