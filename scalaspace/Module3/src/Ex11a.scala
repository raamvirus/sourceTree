//we can have more than one apply method
class Account11a private (val id: Int, initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) { balance += amount }
  def description = "Account " + id + " with balance " + balance
}

// only one companion object with 2 apply methods
object Account11a { 
  def apply(initialBalance: Double) = {
    println(" i am in first apply method of companion object")
    new Account11a(newUniqueNumber(), initialBalance)
  }
  def apply(id: Int,initialBalance: Double) = {
    println(" i am in second apply method of companion object")
    new Account11a(id, initialBalance)
  }
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber }
  println(" i am in companion object")
}

//---------------------------------------------------------------------Client---------------------------------------------------------//
object DemoApply11 extends App {
  val acc = Account11a(1000.0)//by default it calls Account11.apply(1000.0)
  println(acc.description)

  val acc1 = Account11a.apply(77,2000.0)// both are same
  println(acc1.description)
}