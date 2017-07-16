package edu.knoldus.part2

import org.scalatest.FunSuite

/**
  * Created by Neelaksh on 16/7/17.
  */
class HighOrderFuncsTest extends FunSuite {

  test(" check with double value"){
    assert(HighOrderFuncs.sum(HighOrderFuncs.square,3,2) == 13)
  }


}
