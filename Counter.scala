package lectures.part2oop

class counter(val count: Int){
  def inc = {
    println(count)
    new counter(count +1)
  }
  def dec = {
  println(count)
  new counter(count -1)
  }
  def inc( n : Int): counter = {
    if(n <=0) this
    else inc.inc(n-1)
  }
  def dec (n: Int): counter = {
    if (n <=0) this
    else dec.dec(n-1)
  }

}
