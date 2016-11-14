object Main11 extends App{
	
  //Sum is now a higher order function.
  //Its first parameter is a function which take input as param and returns int

  //cannnot happen
  //def sum(nameofthefunction:String,a: Int, b: Int): Int= if (a > b) 0 else nameofthefunction(a) + sumCubes(a + 1, b)
  
  
  
  // def sumCubes(a: Int, b: Int): Int= if (a > b) 0 else cube(a) + sumCubes(a + 1, b)
  // def sumSquares(a: Int, b: Int): Int= if (a > b) 0 else square(a) + sumSquares(a + 1, b)
  //def sumFact(a: Int, b: Int): Int= if (a > b) 0 else fact(a) + sumSquares(a + 1, b)
  //def sumSomething(a: Int, b: Int): Int= if (a > b) 0 else something(a) + sumSquares(a + 1, b)
  
  // def sum(f: Int=> Int, a: Int, b: Int): Int= if(a > b) 0 else f(a) + sum(f, a + 1, b)
  
  
  // sum(cube, 1, 100)
  def sum(f: Int=> Int, a: Int, b: Int): Int=
			if(a > b) 0
			else f(a) + sum(f, a + 1, b)
			
	def sumofint(x: Int): Int= x
	def cube(x: Int): Int= x * x * x
  def square(x: Int): Int = x * x
	def fact(x: Int): Int= if (x == 0) 1 else fact(x -1)
  // def mycustom(): Int = 3
   
   def mycustom(x: Int): Int = 4
	
	//def sumInts(a: Int, b: Int) = sum(sumofint, a, b)
//	def sumCubes(a: Int, b: Int) = sum(cube, a, b)
	
  //Anonymous function
	//def sumCubes(a: Int, b: Int) = sum(x=>x*x*x, a, b)
	
	def sumFactorials(a: Int, b: Int) = sum(fact, a, b)
	
	//println(sumInts(1,10))
	//println(sumCubes(1,10))
  println(sum(sumofint, 1, 100))
  println(sum(cube, 1, 100))
  println(sum(square,1,10))
  println(sum(mycustom,1,10))
  var a = 4
  println(cube(a))
	//println(sumFactorials(1,2))
	
		
}