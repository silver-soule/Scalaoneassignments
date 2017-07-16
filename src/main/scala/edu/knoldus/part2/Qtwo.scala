package edu.knoldus.part2

/**
  * Created by Neelaksh on 16/7/17.
  */
class FirstName(val firstName:String) extends AnyVal{
  override def toString: String = this.firstName
}

class LastName(val lastName:String) extends AnyVal{
  override def toString: String = this.lastName
}

class Age(val age:Int) extends AnyVal{
  override def toString: String = this.age +" years"
}

object Qtwo {
  def printDetails(firstName: FirstName, lastName: LastName, age: Age): String = {
    s"$firstName $lastName is of $age"
  }
}