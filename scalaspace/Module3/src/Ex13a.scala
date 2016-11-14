package com {
  package edureka1 {
    package scala2 {
      class Manager {
        // The following doesn't work: without import
        //import scala.collection.mutable
        //val subordinates = new collection.mutable.ArrayBuffer[Employee]
        
        val subordinates = new _root_.scala.collection.mutable.ArrayBuffer[Employee]
        def description = "A manager with " + subordinates.length + " subordinates"
      }
    }
  }
}

package com {
  package horstmann {
    package collection {
      // ...
    }
  }
}