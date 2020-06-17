package part1basics

object defaultArgsNamedArgs extends App{
  def fact(n:Int, acc: Int = 1): Int = {
    if (n < 1) acc
    else fact(n-1, (n)*acc)
  }
  def saveFig(name: String, width: Int = 100, height: Int = 200) = println("saving figure")
  saveFig("sandeep.jpg")
  saveFig("sandeep.png", width = 200)


}
