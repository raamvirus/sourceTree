object M2_995Collections extends App{
  
  val nums: List[Int] = List(1, 2, 3, 4)
  val emptyList = Nil

  println( "Head of nums : " + nums.head )
  println( "Tail of nums : " + nums.tail )
  
  println( "Is nums empty : " + nums.isEmpty )
  println( "Is emptyLust empty : " + emptyList.isEmpty )
  
  println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
  println("List Concatenation")
  println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
   
  val mynewList1 = List(5,6):::nums
  
  println( List(5,6)::nums)
  
  println( nums::List(5,6) )
  
  println( List(5,6)::nums::nums)
  
  println( nums:::List(5,6) )
  
   
 
  println( "Sum of the list : " + sum3(nums) )
  
  //val nums: List[Int] = List(1, 2, 3, 4)
  
  def sum3(myli :List[Int]):Int = {if(myli == Nil) 0 else myli.head + sum3(myli.tail)}
  
  // sum([1,2,3,4]) = 1 + sum([2,3,4])
  //                      2 + sum([3,4])
  //                          3 + sum([4]) 
  //                              4 + 0
  
  //def sum3(myli :List[Int]):Int = {if(myli == Nil) 0 else {println( "HEad value : "+myli.head); myli.head + sum3(myli.tail)}}

  
  


  

}