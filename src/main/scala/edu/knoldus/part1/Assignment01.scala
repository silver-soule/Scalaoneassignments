package edu.knoldus.part1

/**
  * Created by Neelaksh on 15/7/17.
  */
object Assignment01 {

  def removeElements(a:String) : String = {
    val listOfChars = a.toList
    def correctedString(inpList:List[Char], op:String,currVal:Char): String = {
      //val buffer:String
      if(inpList.isEmpty)
        op
      else if (inpList.head == currVal)
        correctedString(inpList.tail, op + currVal+inpList.head, '\0')
      else
        correctedString(inpList.tail, op, inpList.head)
    }
    //if(listOfChars)
    correctedString(listOfChars,"",'\0')

  }

  def sumList(numList:List[Int])  : Int = {
    def privateCalcSum(acc:Int,numList: List[Int]): Int = {
      //val total = 0;
      if (numList.isEmpty)
        return acc
      privateCalcSum(acc+numList.head, numList.tail)
    }
    privateCalcSum(0, numList)
  }



  def factorialAndAdd(num:Int) : Int = {
    def factorial(acc:Int,num:Int) : Int = {
      if(num== 1||num==0)
        return acc
      //println(num,num%10)
      factorial(acc*num,num-1);
    }

    //multiplyDigits(159)
    def sumDigits(sum:Int,num:Int) : Int = {
      if(num<10)
        return sum
      //println(num,num%10)
      sumDigits(sum+num%10,num/10)
    }

    sumDigits(1,factorial(1,num))
  }

}



