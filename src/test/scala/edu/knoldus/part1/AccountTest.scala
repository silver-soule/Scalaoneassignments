package edu.knoldus.part1

import org.scalatest.FunSuite
//import edu.knoldus.part1.Account
/**
  * Created by Neelaksh on 16/7/17.
  */
class AccountTest extends FunSuite {
  val account = new Account(1,"Neelaksh",10000)
  test("add credit"){
    assert(account.credit(4000).tellBalance()==14000)
  }

  test("take credit"){
    assert(account.debit(9000).tellBalance()==1000)
  }

  test("Underflow account"){
    intercept[java.lang.Exception]{
      account.debit(11000)
    }
  }
}
