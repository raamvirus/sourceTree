//private variable
//no getter or setter will get generated. getter and setter needs to be implemented 

class PrivateDuck{
private var privateAge = 0

def age= privateAge//getter

def age_= (newAge: Int) {if (newAge> privateAge) privateAge= newAge; }//setter
}

object PrivDuckDemo extends App {
  var f = new PrivateDuck
  

f.age_=(10) // It calls f.age=(10)
println(f.age) // It calls f.age()


}