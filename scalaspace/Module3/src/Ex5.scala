class PrivateCounter {
private var value = 0        //this is an private CLASS var & it HAVE setter and getter
def incr() { value +=1 }
def current= value
def isLess(otherVal: PrivateCounter) = value < otherVal.value
}

class PrivateCounter2 {
private var value = 0        //this is an private CLASS var & it HAVE setter and getter
def incr() { value +=1 }
def current= value
def isLess(otherVal: PrivateCounter) = value < otherVal.current
}

class ObjectOnlyCounter {
private[this] var value = 0            //this is an private obj var & it doesnt have setter and getter //only available for this obj
def incr() { value +=1 }
def current= value
//def isLess(otherVal: PrivateCounter) = value < otherVal.value   // we canNOT access OTHER OBJECT VALUE variable
//def isLess(otherVal: ObjectOnlyCounter) = value < otherVal.value // error since value is a private 
def isLess(otherVal: ObjectOnlyCounter) = value < otherVal.current // can be accessed via Class variable only
}


object PrivateCtr extends App {
  var f1 = new PrivateCounter
  var f2 = new PrivateCounter
  
	//var f1 = new ObjectOnlyCounter
	//var f2 = new ObjectOnlyCounter
  f1.incr
  f1.incr
  f2.incr
  println(f2.isLess(f1)) // one is less than two ===>TRUE
}