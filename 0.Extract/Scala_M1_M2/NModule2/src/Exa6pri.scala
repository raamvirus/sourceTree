//Primary Constructor

class AuxDuck1{
	var size = 0;
	var age = 0;
	println("Test")

}

object DemoDuck1 extends App {
  println("Calling default constructor")
  var d1 = new AuxDuck1
  println("Again")
  var dagain = new AuxDuck1
  println (d1.size + "," + d1.age)
    
  
}