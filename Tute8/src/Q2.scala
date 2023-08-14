import scala.io.StdIn

object Q2 {
  def main(args: Array[String]) = {

    println("Enter the number: ")
    val input = scala.io.StdIn.readInt()

    val getMessage: Int => String = num => {
      num match {
        case n if n <= 0 => "Negative/Zero is input"
        case n if n % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
      }
    }

    val msg = getMessage(input)
    println(msg)
  }
}