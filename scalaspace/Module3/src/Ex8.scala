//nested class

import scala.collection.mutable.ArrayBuffer

class Graph{

	class Member(val name: String){
		val contacts = new ArrayBuffer[Member]
	}//sub class

	private val members = new ArrayBuffer[Member] // val

	def join(name: String) =
	{
		val	m = new Member(name)
		members +=m
		m //the last line of method is the return stmt
	}// Method
  
}//Main 


object DemoGraph extends App {
	val chatter = new Graph
	val mFace= new Graph

    val fred= chatter.join("Fred")
    val Wilma = chatter.join("Wilma")
    fred.contacts+= Wilma

    val barney = mFace.join("Barney")
    //fred.contacts+= barney //Error!
}

// A unit has department, within department, has different business verticals.
// Within each vertical engineers are workings