package edu.knoldus.part1

import org.scalatest.FunSuite

/**
  * Created by Neelaksh on 16/7/17.
  */
class Assignment01Test extends FunSuite {

  val numList1 = List(1,2,3)
  val numList2 = List()
  test("String reduction"){
    assert(Assignment01.removeElements("aaabbccbbcdd") == "aabbccbbdd")
    assert(Assignment01.removeElements("abcd")=="")
  }

  test("add elements of list"){
    assert(Assignment01.sumList(numList2) == 0)
    assert(Assignment01.sumList(numList1) == 6)
  }

  test("factorial a number and then add the digits of the result"){
    assert(Assignment01.factorialAndAdd(9)==25)
  }
}
