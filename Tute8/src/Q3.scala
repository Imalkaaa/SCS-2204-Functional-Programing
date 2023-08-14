object Q3 {
  def main(args: Array[String]) = {
    val toUpper: String => String = str => str.toUpperCase()
    val toLower: String => String = str => str.toLowerCase()

    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan", toLower))
    println(formatNames("Saman", toLower))
    println(formatNames("Kumara", toUpper))
  }

  val formatNames: (String, String => String) => String = (name, format) => {
    format(name)
  }
}
