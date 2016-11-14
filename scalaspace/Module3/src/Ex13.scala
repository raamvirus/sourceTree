//packages can be anywhere in the dir structure..but it make confusion
package com {
  package edureka1 {     //1.com.edureka1
    object Utils {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }

    package scala2 {    //2.com.edureka1.scala2
      class Employee(initialSalary: Double) {
        private var salary = initialSalary
        def description = "An employee with salary " + salary
        def giveRaise(rate: Double) {
          salary += Utils.percentOf(salary, rate)
          // Ok to access Utils from parent package
        }
      }
    }
  }//end of edureka1
}

object Main13 extends App {
  val fred = new com.edureka1.scala2.Employee(50000)
  fred.giveRaise(10)
  println(fred)
  println(fred.description)

  val wilma = new com.edureka1.scala2.Manager            //this is in Ex13a
  wilma.subordinates += fred
  wilma.subordinates += new com.edureka1.scala2.Employee(50000)
  println(wilma + ": " + wilma.description)
}
