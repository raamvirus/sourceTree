package com.raam.ex15

package object people {
  val defaultName = "John Q. Public"
}

package people {
  class Person {
    var name = defaultName // A constant from the package
    // the visibility of "description" has been extended to "ex15" package
    private[ex15] def description = "A person with name " + name
    // the visibility of "description" has been extended to "com" package
    //private[com] def description = "A person with name " + name
  }
}


object Main15 extends App {
  val john = new com.raam.ex15.people.Person
  println(john.description)
}