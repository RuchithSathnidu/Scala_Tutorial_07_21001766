import scala.io.StdIn
object second_question {
  def main(args: Array[String]): Unit = {
    val inputLine = StdIn.readLine("Enter integer numbers separated by spaces : ")
    val inputList = inputLine.split(" ").map(_.toInt).toList
    val output = calculateSquare(inputList)
    println("Square of inputs : " + output)
  }

  def calculateSquare(input: List[Int]): List[Int] = {
    input.map(number => number * number)
  }

}
