package lectures.part2oop

class Writer(firstname:String, surname: String, val year: Int){
  def fullname: String = firstname + " " +surname
}

class Novel(name:String, year_of_release: Int, author: Writer){
  def authorAge = year_of_release - author.year

}
