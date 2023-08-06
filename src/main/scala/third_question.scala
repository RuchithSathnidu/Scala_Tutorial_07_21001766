import scala.io.StdIn
object third_question {
  def main(args: Array[String]): Unit = {
    val inputLine = StdIn.readLine("Enter integer numbers separated by spaces : ")
    val inputList = inputLine.split(" ").map(_.toInt).toList
    val output = filterPrime(inputList)
    println("Prime number list : " + output)
  }
  def gcd(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => gcd(x, a)
    case x => gcd(x, a % x)
  }

  def prime(n: Int, v: Int = 2): Boolean = v match {
    case x if n<x => false
    case x if (x == n) => true
    case x if gcd(n, x) > 1 => false
    case x => prime(n, x + 1)
  }

  def filterPrime(input: List[Int]): List[Int] = {
    input.filter(number => prime(number))
  }

}
