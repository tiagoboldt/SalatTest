package test

import com.novus.salat.annotations._
import org.bson.types.ObjectId


// Nested classes are not currently supported - see https://github.com/novus/salat/wiki/SupportedTypes

//object Messages {
  case class Employee(name: String, age: Option[Int], @Key("_id") id: ObjectId = new ObjectId)

//}
