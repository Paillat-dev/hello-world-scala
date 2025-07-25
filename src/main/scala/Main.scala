import fansi.Attr
import fansi.Color
import scala.io.Source

def colors: List[Attr] = List(
  Color.Red,
  Color.LightRed,
  Color.Yellow,
  Color.Green,
  Color.Blue,
  Color.Magenta
)

val message: String = Source.fromResource("hello.txt").mkString

@main def hello(): Unit = {
  val splitMessage: Array[String] = message.split("\n")
  for (i <- splitMessage.indices) {
    val colorIndex  = i % colors.length
    val coloredLine = colors(colorIndex)(splitMessage(i))
    println(coloredLine)
  }
}
