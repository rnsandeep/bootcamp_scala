package part1basics

  object computeFibanacci extends App{
    def fibanacciTailRecursion(actual:Int): Int = {
      def fibanacciHelper(n:Int, accumulator1:Int, accumulator2:Int): Int =
        if (n >= actual) accumulator1
        else fibanacciHelper(n+1, accumulator1+accumulator2, accumulator1 )
      if (actual<=2) 1
      else fibanacciHelper(2, 1, 1)
    }
    println(fibanacciTailRecursion(8))
}
