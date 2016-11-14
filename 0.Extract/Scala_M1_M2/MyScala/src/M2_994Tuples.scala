object M2_994Tuples extends App {

   val intList = List(2,7,9,1,6,5,8,2,4,6,2,9,8)
   
   val simpleTupe = (2,3,"name","anotherstring")
   
   val quicktry = intList.partition (_ > 2)   // def myfun(x) :(int) => x>2  
   

      val (big1,small) = intList.partition (_ > 5)

   
   //val quicktry = intList.partition (fun(x) => x >2)
   
   
      println("intList"+intList.getClass)
      println("##############Greater than 2########")
   
   println(" quicktry"+quicktry)
   println(" quicktry first element"+quicktry._1)
   println(" quicktry second element"+quicktry._2)
   println(" quicktry"+quicktry.getClass)
   println("##############Greater than 5########")
   
   println(" big numbers" + big1)
   println(" small numbers" + small)

    

   
   
}