//AUxiliary Constrctors are overloaded constructor
// default constructor is the primary constuctor
class AuxDuck{
	var size = 0;
	var age = 0;
	println("All the statments gets executed for default constructor")

	//Auxilary constructor one
	def this(size: Int){
		this() // Calls the primary constructor
		println("after this is one argument constructor")

		this.size= size
	}

	//Auxilary constructor Two
	def this(size:Int, age:Int)
	{
		this(size) // calls previous auxiliary constructor
		println("after this is two argument constructor")
		this.age= age
	}
}

object DemoDuck extends App {
	println("calling Default Constructor")
  var d1 = new AuxDuck
		println("calling One Arg Constructor")
  var d2 = new AuxDuck(5)
		println("calling Two Arg Constructor")
  var d3 = new AuxDuck(5,10)

  println (d1.size + "," + d1.age) // o/p is string
  println (d2.size)
  println (d2.size, d2.age) //o/p is tuple
                            //because of comma Println considers tuple as input
  println (d3.size, d3.age) //o/p is tuple
  
}