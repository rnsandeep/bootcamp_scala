package part1basics

import scala.annotation.tailrec

object isPrimeNumber extends App{
  def isPrimeTailRecursion(actual:Int): Boolean = {
    @tailrec
    def isPrimeHelper(n:Int, actual:Int, accumulator:Boolean): Boolean =
      if (!accumulator) false
      else if (n <= 1) true
      else isPrimeHelper(n-1, actual, actual%(n) !=0 && accumulator)
    isPrimeHelper(actual/2, actual, true)
  }
  println(isPrimeTailRecursion(100))
}
