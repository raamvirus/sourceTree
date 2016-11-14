
//constructor is private and companion object able to access it.
class Account11 private (val id: Int, initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) { balance += amount }
  def description = "Account " + id + " with balance " + balance
}

object Account11 { // The companion object
  println ("I am in Companion Object")
   println ("lastNumber" +lastNumber)
   
   
  def apply(initialBalance: Double) ={
    
    println("I am in apply method of companion object")
    new Account11(newUniqueNumber(), initialBalance)}
  
  
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1;
  
  println("Last number in companion object generator"+lastNumber)
  lastNumber }
  
}

object DemoApply extends App {
  println("Before acct")
  val acct = Account11(1000.0)
  println("After acct")
  println(acct.description)
  println("Before acct1")
  val acct1 = Account11.apply(2000.00)
    println(acct1.description)
    val acct2 = Account11(2000.00)


 
}



