class CompAccount{
	val id = CompAccount.newNum() //calling static method
	println("this is id value "+id)
	private var bal= 0.0
}

//Companion Object -similar to static methods ;;;should have same name as of class name
object CompAccount{//similar to singleton class of ex9
	println("i am in object") //only one time is called as a single instance is created
  private var lastNum= 0;   //only one time is called as a single instance is created
  private def newNum() = { lastNum+=1; lastNum}
}

//this is singleton object 
object DemoComp extends App {
	val r1 = new CompAccount  //while creating instance all line in class will execute
	val r2 = new CompAccount
	println("id1: " + r1.id)
	println("id2: " + r2.id)
}


// useful while creating db connection objects
// even newNum() is private;;;the instance object can access it
// adv: single object is maintained for a class entire process (like serial num etc)
//singleton & companion are same ,except companion has same name as of class name