package patternMatching

object patternEveryWhere extends App{
  try{

  }
  catch {
    case e: RuntimeException => "Run time Exception"
    case n: NoSuchElementException => " No  such element exception"
    case npe: NullPointerException => " Null pointer Exception"
    case _ => "Something else"
  }

  val list = List(1, 2, 3, 4)
  val evenOnes = for {
    x <- list if x % 2 == 0
  } yield scala.math.pow(10, x)
  println(evenOnes)

  val tuples = List((1,2), (3, 4))
  val multiples = for {
    (first, second) <- tuples
  } yield first*second
  println(multiples)

  val tuple = (2, 3, 4)
  val (a, b, c) = tuple
  println(b)

  val head::tail = list
  println(head)
  println(tail)

  val mappedList = list.map{
    case v if v%2 == 0 => v + "is even number"
    case 1 => " the one"
    case _ => "something else"
  }
  println(mappedList)
  val mappedList2 = list.map { x =>
    x match {
      case v if v % 2 == 0 => v + "is even number"
      case 1 => " the one"
      case _ => "something else"
    }
  }
  println(mappedList)
}
