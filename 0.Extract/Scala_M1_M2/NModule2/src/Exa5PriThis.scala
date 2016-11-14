//Basic example on Object private [this]

class ObjectOnlyThisCounter {
private[this] var ssn = 0
def current= ssn

def isLess(otherPerson: ObjectOnlyThisCounter) = current < otherPerson.current //This is not possible
//def isLess(otherVal: ObjectOnlyCounter) = ssn < otherVal.ssn 

}


object PrivateThisCtr extends App {
  var f1 = new ObjectOnlyThisCounter
  var f2 = new ObjectOnlyThisCounter


 println(f2.isLess(f1)) // It calls f.size()
  

}