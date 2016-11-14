class Person17 {
  var name = ""
  override def toString = getClass.getName + "=> [name=" + name + "]"
}

//"override" modifier must be used to override an abstract method
//Invoking superclass method is same as in Java, by "super" keyword
class Employee17 extends Person17 {
  var salary = 0.0
  override def toString = super.toString + "=> [salary=" + salary + "]" // calling "super class" method and appending sal & 
}                                                                       // overriding the same method . Comment it & run

object Main17 extends App {
  val vishal = new Employee17
  vishal.name = "Vishal "
  vishal.salary = 500000
  println(vishal)
}

/*
The override modifier is useful in following scenarios:
»When name of the method being overridden is misspelled
»When a wrong parameter type is provided
»When a new method is introduced in superclass which clashes with a subclass method
*/