package edu.knoldus.part1

/**
  * Created by Neelaksh on 16/7/17.
  */
class Account(id:Int,name:String,balance:Int){
  require(balance>0)
  def credit(amount:Int): Account ={
    new Account(this.id,this.name,this.balance+amount)
    //println(bal)
  }
  def debit(amount:Int): Account=  {
    if(balance - amount >= 0)
      return new Account(id , name , balance - amount)
    throw new Exception("going over limit")
  }
  def tellBalance():Int =  {
    this.balance
  }

}