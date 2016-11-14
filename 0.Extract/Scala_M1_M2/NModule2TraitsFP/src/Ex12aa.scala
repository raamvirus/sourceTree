

object Main12aa extends App{
  
 // println(1 to 9)
 // (1 to 9).foreach(println(_))
  
 def mysimplefunct(a: Int): Int = (a*a)+2
 
  val myArray = (1 to 9).map(mysimplefunct).toArray
  

 for(myindVal <- myArray)
 {
 println(myindVal)
 }
 
 println("##############################################")
 
 //(1 to 9).map(mysimplefunct).foreach(println)
 

 
 //println((1 to 9).map(mysimplefunct))
  
  // (1 to 9).map(x => x+1).foreach(println)

  
  (1 to 9).filter(_ % 2 == 0).foreach(println _)
  
  (1 to 9).map(0.1 * _).foreach(println _)
  
    //  println((1 to 4).reduceLeft(_ + _))
  
   val findMax = (x: Int, y: Int) => {
      val winner = x max y
       println("compared %d to %d, %d was larger".format(x,y,winner))
      winner
    }
    
    
    
    val a = Array(20, 12, 60, 15, 2, 90,10)
    a.reduceLeft(findMax)

  
    
}