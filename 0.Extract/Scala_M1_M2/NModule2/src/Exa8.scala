//Singleton Object

object SingletonReservations{
private var lastNum= 0;
val someconst = 3.14
def newReservationNum() = { lastNum+=1; lastNum}
}

object DemoRes extends App {
	val r1 = SingletonReservations.newReservationNum
	val r2 = SingletonReservations.newReservationNum
	val r3 = SingletonReservations.newReservationNum
  val r4 = SingletonReservations.someconst
	println("r1: " + r1 + " r2: "+ r2 + " r3: " + r3)
}