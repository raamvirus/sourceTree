class PrivateDuck{
private var privateAge= 0 //variable is private so need to define setter & getter
def age= privateAge       //getter
def age_= (newAge: Int) {if (newAge> privateAge) privateAge= newAge; }//setter
}


object PrivDuckDemo extends App {
  
  var f = new PrivateDuck
  f.age_=(-10) // It calls f.age=(10)
  println(f.age) // It calls f.age()
  
  concat("raam ",5);
  concat("kumar ","kumar ","hello")

  def concat(a:String,b:Int){
    println(a+b)
  }

  def concat(a:String,b:String,c:String){
    println(a+b+c)
     
  }

}

//usecase : bank balance no setter & getters.it should be calculated by 
//withdraw & deposite method which is exposed as public