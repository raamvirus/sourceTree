//Another example for private var and val
// Example to test val property as well

class ReadOnlyCounter
{
private var value = 0
val myPiValue = 3.14
def incr() { value +=1 }
def current= value

}


object ReadOnlyCtr extends App {
  var f = new ReadOnlyCounter
  f.incr
println(f.current)
  
  println(f.incr)
  println(f.current)

  println(f.myPiValue)
  
  var mytest = f.myPiValue
  println(mytest)

 
 // f.myPiValue_=4.4 //This is not possible
 // f.myPiValue =4.4 //This is also not possible
  
  
  
}