// default constructor has 2 arg.where as we pass 1 arg via apply method
//companion obj is created once & this object method we are using 'n' number of times.
//------------------------------------------------------------------------Server---------------------------------------------------------//
//constructor Account11 is private & companion obj able to access it.
class Account11 private (val id: Int, initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) { balance += amount }
  def description = "Account " + id + " with balance " + balance
}

// The companion object
object Account11 { 
  def apply(initialBalance: Double) = {
    println(" i am in apply method of companion object")
    new Account11(newUniqueNumber(), initialBalance)
  }
  private var lastNumber = 0
  println("lastno:"+ lastNumber)
  private def newUniqueNumber() = { lastNumber += 1;
  println("lastnumber generated:"+ lastNumber);
  lastNumber }
    println(" i am in companion object")
    
}

//---------------------------------------------------------------------Client---------------------------------------------------------//
object DemoApply extends App {
	val acct = Account11(1000.0)//by default it calls Account11.apply(1000.0)
	println(acct.description)

	val acct1 = Account11.apply(2000.0)// both are same
	println(acct1.description)
}