package test

import com.mongodb.Mongo
import java.util.Date
import org.bson.types.ObjectId
import Messages._
import com.novus.salat._
import com.novus.salat.global._
import com.mongodb.casbah.Imports._


object Main extends App {

  val emp = Employee("a", Some(10))
  val dbo = grater[Employee].asDBObject(emp)




}
