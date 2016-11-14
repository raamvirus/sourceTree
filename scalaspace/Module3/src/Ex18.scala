class Person18 {
  var name = ""
  override def toString = getClass.getName + "[name=" + name + "]"
}
//-------------------------------------------------------------------------//
class Employee18 extends Person18 {
  var salary = 0.0
  override def toString = super.toString + "[salary=" + salary + "]"
}
//-------------------------------------------------------------------------//
class Manager extends Employee18
//---------------------------------------------------------------------------------------------------------------------//
object Main extends App {

  val r = scala.math.random        //Generate a random num
  //val r = 0.1
  println("value of r is--> " + r)

  val p = if (r < 0.33) new Person18    //  r is less than .33,create person
    else if (r < 0.67) new Employee18   // r is b/n .34 & .66, create emp
    else new Manager                    // else ,create manager
//-------------------------------------------------------------------------//
  if (p.isInstanceOf[Employee18]) {     //to decide whether an object belongs to a class hierarchy

//            to convert a reference to a subclass reference
    val s = p.asInstanceOf[Employee18] // s(manager) has type Employee
    println("It's an employee.")
    s.salary = 50000
    
     if (p.getClass == classOf[Manager]) {    //to determine the class of a given reference
      println("Actually, it's a manager")
      s.salary *= 2
    }
  }
//-------------------------------------------------------------------------//
   if (p.getClass == classOf[Person18]) {
      println("This is Just a person!")
    }
//-------------------------------------------------------------------------//  
  println(p)
}
