case class Person(firstName: String, lastname: String)

object caseDemo extends App{
    val me = Person("Muthu","Kumar")
    val first = me.firstName
    val last = me.lastname
    
    val me1 = Person("Muthu","Kumar")

    
    if (me == Person(first, last))
    {
      println("Found Myself")
      println("me")
    }
    
  }
