//Another example for val vs var 

class ReadOnlyCounter{

private var value = 0
val myPivalue = 3.14    // only getter are generated i.e read only
def incr() {value +=1;} //setter // procedure for incrementing 
def current=value       //getter
}

object ReadOnlyCtr extends App{
	var f = new ReadOnlyCounter    // object creation
	f.incr                         //calling the method
	println(f.current) // it calls getter
  
  println(f.incr)     //println(f.incr()) 
  println(f.current) // 
  
  println(f.myPivalue)
  //f.myPivalue = 4.4   ERROR as its VAL 
}