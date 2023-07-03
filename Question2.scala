import scala.io.StdIn.readInt

object Question2 {
  def pattern(n: Int): Unit = n match {
    case y if y < 0 => println("Negative")
    case y if y == 0 => println("Zero")
    case y if y % 2 == 0 => println("Even")
    case y if y % 2 == 1 => println("Odd")
  }

  def main(args: Array[String]): Unit = {
    println("Enter integer input: ")
    val num = readInt()
    pattern(num)
  }

}