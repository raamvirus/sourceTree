class Person16 {              //super class
  var name = ""
}

class Employee extends Person16 {          //sub class extending parent class
  var salary = 0.0
  def description = "Employee Name is:- " + name + " and salary is:- " + salary
}

object Main16 extends App {
  val fred = new Employee
  fred.name = "Vishal Kumar"
  fred.salary = 500000
  println(fred.description)
}