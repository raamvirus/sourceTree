//Construction sample

class CompAccount{
println("I am in class starting")
val id = CompAccount.newNum()
println("This is id value "+id)
private var bal= 0.0
}

object CompAccount{
  println("I am in object ")    // this line will not get printed when second object getting created
var scopeTest = 0
private var lastNum= 0;
private def newNum() = { lastNum+=1; lastNum}
}

object DemoComp extends App {
	println("Before first object")
  val r1 = new CompAccount
  println("After first object")
	val r2 = new CompAccount
  println("After second object")
	println("id1: " + r1.id)
	println("id2: " + r2.id)

}