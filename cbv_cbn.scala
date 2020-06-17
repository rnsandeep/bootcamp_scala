package part1basics

object cbv_cbn extends App{
  def callByValue(x:Long): Unit ={
    println("call by value: value1:",x)
    println("call by value: value2:",x)
  }
  def callByName(x: => Long): Unit = {
    println("call by name: value1:", x)
    println("call by name: value2:", x)
  }
  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
