//Constructor with arguments

class PrimDuck(val size:Int, val age:Int) {
	println("Inside duck constructor")
	def desc= "Duck of age "+ age + " is of size "+ size
}


object DemoPrimDuck extends App {
  var d1 = new PrimDuck(10, 5)
  println("Construction Done")
 // var d2 = new PrimDuck()
  println(d1.desc) //Try commenting this
}