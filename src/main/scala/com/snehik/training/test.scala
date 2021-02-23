package com.snehik.training


object higherOrderFunctionDemo{
  def higherOrderFunction(input:List[Int],f:Int=>Int):Int={
      val modifiedList=input.map(x=>f(x))
      val sum = modifiedList.foldLeft(0)((cum,x)=>cum+x)
      sum
  }
}

object test {
  def main(args:Array[String])={

    val input = List(1,2,3,4,5)
    def square = (x:Int) => x*x
    def cube = (x:Int) => x*x*x

    println(higherOrderFunctionDemo.higherOrderFunction(input,square))
    println(higherOrderFunctionDemo.higherOrderFunction(input,cube))
  }
}
