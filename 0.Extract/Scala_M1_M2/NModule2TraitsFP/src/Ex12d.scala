object Main12d extends App {
  
  def even (x:Int) = (x%2) ==0
  
val a = List(1,2,3,4,5,6,7)
val b = List (2,4,6,7,10,12,13)



println(a.forall(even))

println(a.exists(even))
println(b.partition(even))
println(b.partition(even)._1)
println(b.partition(even)._2)


}