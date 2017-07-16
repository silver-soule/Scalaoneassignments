package edu.knoldus.part2

/**
  * Created by Neelaksh on 17/7/17.
  */
object ScalaDayThree {
  def addLists(l1:List[Int],l2:List[Int])  : List[Int] = {
    def privateAddLists(l1:List[Int],l2:List[Int], cache:List[Int] )  : List[Int] = {
      if(l1.isEmpty || l2.isEmpty)
        cache
      else
        privateAddLists(l1.tail,l2.tail,l1.head+l2.head::cache)

    }
    val cache = List[Int]()
    privateAddLists(l1,l2,cache).reverse
  }

  def fib(num:Int)  : List[Int] = {
    def privateFib(num1:Int,num2:Int,op:List[Int], max:Int,curr:Int) :List[Int]=  {
      if(curr>max)
        op
      else
        privateFib(num2+num1,num1,num2::op,max,curr+1)
    }
    privateFib(1,0,Nil,num,1).reverse
  }

  def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int):String = {
    shape match {
      case "rectangle" => s"Area of rectangle is ${f(first,second)}"
      case "rhombus" => s"Area of rhombus is ${f(first,second)}"
      case "parallelogram" => s"Area of parallelogram is ${f(first,second)}"
      case _ => " Invalid shape"
    }
  }

  def rectangleArea(h:Int,b:Int) : Int = {
    h*b
  }


  def rhombusArea(h:Int,b:Int) : Int =  {
    h*b/2
  }

  def parellelogramArea(h:Int,b:Int) : Int =  {
    h*b
  }

  def doubleElements(li:List[Int]): List[Int] = {
    li.map(_*2)
  }

}
