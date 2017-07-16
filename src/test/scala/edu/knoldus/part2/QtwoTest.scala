package edu.knoldus.part2

import org.scalatest.FunSuite
/**
  * Created by Neelaksh on 17/7/17.
  */
class QtwoTest extends FunSuite {

  val firstname =new FirstName("neelaksh")
  val lastName = new LastName("chauhan")
  val age = new Age(21)
  test("testPrintDetails") {
    assert(Qtwo.printDetails(firstname,lastName ,age) == "neelaksh chauhan is of 21 years")
  }

}
