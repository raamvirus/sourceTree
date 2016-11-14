object Main10 extends App {
	//sum of Integer ,a is the starting & b is end of the range
  
  def sumInts(a: Int, b: Int): Int =
			if(a > b) 0 else a + sumInts(a + 1, b)
      
//-------------------------------------------------
      //redundant code if new business requirement 
      def cube(x: Int): Int= x * x * x

      // sum of Cubes
	def sumCubes(a: Int, b: Int): Int=
		if (a > b) 0 else cube(a) + sumCubes(a + 1, b)
		
    
//-------------------------------------------------    
    //redundant code if new business requirement 
    def square(x: Int): Int= x * x

 //Sum of Square
    def sumSquares(a: Int, b: Int): Int=
    if (a > b) 0 else square(a) + sumSquares(a + 1, b)

//-------------------------------------------------    
    
    println(sumInts(1,10))
    
    println(sumCubes(3,5))
    
 //  def addOne(i:Int):Int={i+1}
	//def addOne(i:Int):Int={i+=1}
	
//	println(addOne(2))

	
}