//Object is similar to class but only one instance is created and its being updated.

//this is singleton object
object SingletonReservations{
private var lastNum= 0;
def newReservationNum() = { lastNum+=1; lastNum} // lastNum is the return value as its the last line
}

//this is singleton object
object DemoRes extends App {
  //val one  =  SingletonReservations // no new keyword
  
	val r1 = SingletonReservations.newReservationNum //Constructor of Singleton Object is executed when the object is first used
	val r2 = SingletonReservations.newReservationNum
	val r3 = SingletonReservations.newReservationNum
	println("r1: " + r1 + " r2: "+ r2 + " r3: " + r3)
}


//its used in generating unique id like service request no (or) how many times a page has been accessed
// so a single object should be used to do this