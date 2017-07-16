package edu.knoldus.part2

import org.scalatest.FunSuite

/**
  * Created by Neelaksh on 17/7/17.
  */
class ScalaDayThreeTest extends FunSuite {
  val l1 = List(1,2,3)
  val l2 = List(4,5,6)
  val fib = List(0,1,1,2,3,5)
  test("add 2 lists") {
    assert(ScalaDayThree.addLists(l1,l2) == List(5,7,9))
  }

  test("generate fibonacci"){
    assert(ScalaDayThree.fib(6) == fib)
  }

  test(" check area function"){
    assert(ScalaDayThree.area("rectangle",2,10,ScalaDayThree.rectangleArea) == "Area of rectangle is 20")
  }

  test(" check if list doubles"){
    assert(ScalaDayThree.doubleElements(l2) == List(8,10,12))
  }

}
