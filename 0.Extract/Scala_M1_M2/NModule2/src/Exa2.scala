//Basic example on getter and setter with default variable

class Duck{
  var size = 1  // will genereate two functions size and size_
}

object DuckDemo extends App {
  var f = new Duck
//f.size = 5 // It calls f.size_=(5)     //setter. = is the differentiator
//f.size_=(10) // It calls f.size_=(10)  //setter
  f.size_=(8)   
 f.size = (8)
  
 
 
 
 f.size = 8
 println("Result of f.size "+f.size) // It calls f.size()  //getter
  

}