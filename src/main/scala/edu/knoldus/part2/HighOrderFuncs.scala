package edu.knoldus.part2

/**
  * Created by Neelaksh on 16/7/17.
  */
object HighOrderFuncs{
  def sum(f: (Int,Int) => Int,a: Int, b:Int): Int  = {
    f(a,b)
  }

  def sumOfInts(a:Int,b:Int): Int = a + b

  def square(a:Int,b:Int): Int = sumOfInts(a*a,b*b)

  def cube(a:Int,b:Int) : Int=  sumOfInts(a*a*a,b*b*b)

}