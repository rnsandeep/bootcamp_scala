package lectures.part2oop

object InheritanceTraits extends App{
  class Animal{
    def eat = println("eating animal")
  }
  class Zebra extends Animal
  val zebra = new Zebra
  zebra.eat

  
}