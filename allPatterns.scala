package patternMatching

object allThePatterns extends App{

  val x: Any = this
  val constants = x match{
    case 1 => "a number"
    case "Scala" => "the scala"
    case true => "the Truth"
    case allThePatterns => "a SingleTon Object"
  }
  println(constants)

  val x1 = "&&&12abc ahsajsi"
  val matchAnything = x match{
    case _ => "can match anything"
  }
  println(matchAnything)

  val matchVariable = x1 match{
    case something => s"I've found something"
  }
  println(matchVariable)
  val aTuple = (1, 2)
  val matchATuple = aTuple match{
    case (1, 1) => "(1,1) matched"
    case (something, 2) => s" matched second number but first number is $something"
  }
  println(matchATuple)
  var nestedTuple = (1, (2, 3))
  val matchNestedTuple = nestedTuple match{
    case (_, (2, something)) => s"matched nested tuple with variable $something"
  }
  println(matchNestedTuple)
}