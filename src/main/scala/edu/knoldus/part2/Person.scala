package edu.knoldus.part2

/**
  * Created by Neelaksh on 16/7/17.
  */
class Person(val name: String, val age: Int) extends Ordered[Person] {
  override def compare(that: Person): Int = {
    if (this.name == that.name) {
      this.age - that.age
    }
    else {
      this.name.length - that.name.length
    }
  }
}