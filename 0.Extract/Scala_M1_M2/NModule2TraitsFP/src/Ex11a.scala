object Main111 extends App{
	
  //Sum is now a higher order function.
  //Its first parameter is a function which take input as param and returns int
  
  def sum(f: Int=> Int, a: Int, b: Int): Int=
			if(a > b) 0
			else f(a) + sum(f, a + 1, b)
      
      //f = (x:Int) => x*2 
      //f(1)  => 1*2
      //f(2) => 2*2
			
	def sumofint(x: Int): Int= x
	def cube(x: Int): Int= x * x * x
	def fact(x: Int): Int= if (x == 0) 1 else fact(x -1)
	def square(x: Int): Int= x * x

  println(sum(sumofint, 1, 100))
  println(sum(cube, 1, 100))
  println(sum(square, 1, 100))
  println(sum(x => (x * x)+2, 1,3))
  
   println(sum((x:Int) => x*x , 1,3))
   println(sum((x:Int) => x*2 , 1,3))
	println(sum(_*2 , 1,3))
		
}