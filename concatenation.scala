package part1basics

object stringConcatenation extends App{
  def concatenateTailRecursion(s: String, n:Int): String = {
    def concatenateHelper(s: String, n:Int, accumulator:String): String =
      if (n<=0) accumulator
      else concatenateHelper(s, n-1,  s+accumulator)
    concatenateHelper(s, n, "")
  }
  println(concatenateTailRecursion("sandeep", 10))
}