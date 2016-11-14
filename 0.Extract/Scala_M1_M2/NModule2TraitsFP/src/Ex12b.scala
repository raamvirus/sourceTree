object Main12b extends App {
  
  val set = (0 to 20).toSet					//set of values
  def isEven(i:Int) = i%2 ==0				//function returns "true" if (i%2)==0
  
  println(set.filter(i=>isEven(i)))			// syntaxtical sugars
  println(set.filter(isEven(_)))			//or
  println(set.filter(isEven))				//or
}