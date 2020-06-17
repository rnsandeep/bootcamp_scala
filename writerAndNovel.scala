package lectures.part2oop

class Writer(firstname:String, surname: String, val year: Int){
  def fullname: String = firstname + " " +surname
}

class Novel(name:String, year_of_release: Int, author: Writer){
  def authorAge = year_of_release - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}
object Basics extends App {
  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))
}
