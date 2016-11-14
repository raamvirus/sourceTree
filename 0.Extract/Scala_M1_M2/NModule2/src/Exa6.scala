//Constructor execution hierarchy

class AuxDuck{
	var size = 0;
	var age = 0;
	println("Test")
	def this(size: Int){
    this() // Calls the primary constructor
   // super() // Calls the primary constructor
    println("after this in One Argument Constructor")

		this.size= size
	}

	def this(size:Int, age:Int)
	{
		this(size) // calls previous auxiliary constructor
    println("after this in two Argument Constructor")
		this.age= age
	}
    println("Test End")
}

object DemoDuck extends App {
  println("Calling default constructor")
  var d1 = new AuxDuck
  println("Again")
  var dagain = new AuxDuck

  println("Calling one arg constructor")
  var d2 = new AuxDuck(5)
  println("Calling two arg constructor")
  var d3 = new AuxDuck(5,10)

  println (d1.size + "," + d1.age)
    println (d1.size , d1.age) 
  println (d2.size)
  println (d2.size, d2.age) //watch the output of this statement. 
                          //Because of comma Println considers tuple as input
  println (d3.size, d3.age) //watch the output of this statement
  
}