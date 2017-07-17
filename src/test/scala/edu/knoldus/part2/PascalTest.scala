package edu.knoldus.part2

import org.scalatest.FunSuite

/**
  * Created by Neelaksh on 17/7/17.
  */
class PascalTest extends FunSuite {

  test("testComputePascal") {
    assert(Pascal.computePascal(1,2) == 2)
    assert(Pascal.computePascal(0,2) == 1)
    assert(Pascal.computePascal(1,3) == 3)
  }

}
