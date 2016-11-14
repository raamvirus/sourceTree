case class Person(firstName: String, lastname: String)		//case class,no setter only getter is present//generally used to represent a record

object caseDemo extends App{
    val me = Person("Muthu","Kumar")				//Create me obj of type Person & directly passing the value
    val first = me.firstName						//getter
    val last = me.lastname							//getter
    //me.firstName = "changed"						// not possible to change
	
    val me1 = Person("Muthu","Kumar")

    
    //if (me == Person(first, last))
	if (me == Person("anothername", last))
    {
      println("Found Myself")
      println("me")
    }
    
  }
