object Ex13e extends App {
  val vowelSet = Set('a', 'e', 'i', 'o', 'u')
  
  val b = List (2,2,2,4,6,7,10,4,5,6,12,6,6,6,13)
  println(b.toSet)
  
  
  
  def vowelsInString(string: String) = string.filter(vowelSet).toSet
  
  println(vowelsInString("united states"))
  
  vowelsInString("united states").map(println)
  
  
}
