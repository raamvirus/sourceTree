//Basic example on Object private [this]

class PrivateCounter {
private var ssn = 0
def incr() { ssn +=1 }
def getSsn= ssn

def isLess(otherObject: PrivateCounter) = ssn < otherObject.getSsn
}

class ObjectOnlyCounter {
private[this] var ssn = 0
def incr() { ssn +=1 }
def current= ssn
//def last4digitcurrent= {get the last 4 digit of value}

//f2.isLess(f1)

def isLess(otherPerson: ObjectOnlyCounter) = current < otherPerson.current //This is not possible
//def isLess(otherVal: ObjectOnlyCounter) = ssn < otherVal.ssn 

}


object PrivateCtr extends App {
  //var f1 = new PrivateCounter
  //var f2 = new PrivateCounter

  var f1 = new ObjectOnlyCounter
  var f2 = new ObjectOnlyCounter

  
  f1.incr
  f1.incr
  f2.incr
 
 println(f2.isLess(f1)) // It calls f.size()
  
  
  
}