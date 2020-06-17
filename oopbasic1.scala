package lectures.part2oop

object oopBasic1 extends App{
  val per = new Person("John", age = 26)
  println(per.age)
  per.greet("Daniel")


}
class Person( name: String, val age: Int){
  def greet(name: String): Unit =
    println(s"${this.name} says:, Hi $name")
}