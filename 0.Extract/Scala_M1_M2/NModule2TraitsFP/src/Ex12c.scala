object Main12c extends App {
  
def capitalize(s:String) = s.head.toUpper + s.tail.toLowerCase		//String is an collection of characters.so head of collection gets the first character
																	//and tail all the rest of collection excluding the first one	
val mylistofValues = List("kumar","muthu","sCala","traiNING")



val resultList = mylistofValues.map(capitalize)
//val resultList = mylistofValues.map( (_.head.toUpper + _.tail.toLowerCase) )
//result of a map is always a collection
println(resultList)

resultList.map(println) //or resultList.foreach(println) //or for(x <- resultList) {println(x)}


}