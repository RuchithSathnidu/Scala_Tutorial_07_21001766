import scala.io.StdIn
object first_question {
       def main(args : Array[String]) :Unit  = {
         val inputLine = StdIn.readLine("Enter integer numbers separated by spaces : ")
         val inputList = inputLine.split(" ").map(_.toInt).toList
         val output = filterEvenNumbers(inputList)
         println("Even number list : " + output)

       }

  def filterEvenNumbers(input: List[Int]): List[Int] = {
    input.filter(number => number % 2 == 0)
  }

}
