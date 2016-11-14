class PrimDuck(val size:Int, val age:Int) {
	println("Inside duck constructor")
	def desc= "Duck of age "+ age + " is of size "+ size // in java we have method name as of class name
}


object DemoPrimDuck extends App {
  var d1 = new PrimDuck(10, 5)
  println(d1.desc) // try commenting this
}