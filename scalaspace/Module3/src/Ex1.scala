
class Firstclass{
  var size = 1     //variable is scope is public so scala defaultly have getter & setter
  val constantval =10.0 //only getters and NO setters
  var t:String=""
}

class Secondclass{
  var size = 10
}

object DuckDemo extends App {
  
  var f = new Firstclass //object can also created by Firstclass();

  f.size = (5) // It calls "setter" f.size_=(10)
  //or f.size_= 99 // It calls f.size_=(10)
  //f.t_=("cat")
  //println(f.t)
  
  println(f.size) // It calls "getter" f.size()
  println(f.constantval)
}