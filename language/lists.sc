/**
  * LISTS
  *
  * things to know:
  *
  * - you can't add elements to a Scala List; it's an immutable data structure
  *
  * */


/*
* ----------------------
*  List initialization
* ----------------------
* */

var aList  = List(1,2)

/*
* ----------------------
*  Append item to left of List
* ----------------------
*
* it creates a new list from a existing list
*
* */

var newList = 3 :: aList

println(newList)


/*
* ----------------------
*  "trick" to have a dinamyc list
* ----------------------
*
*  use the ListBuffer class and then convert it to a List
* */

import scala.collection.mutable.ListBuffer

var fruits = new ListBuffer[String]()
fruits += "Apple"
fruits += "Banana"
fruits += "Orange"

val fruitsList = fruits.toList