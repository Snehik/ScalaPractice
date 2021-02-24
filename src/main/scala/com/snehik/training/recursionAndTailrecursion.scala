package com.snehik.training

object result{
  def factorial(x:Int):Int={
    if (x<=0) 1
    else
      x*factorial(x-1)
  }

  def anotherFactorial(x:Int):Int={
    def helper(x:Int,accumulator:Int):Int={
      if(x<=1) accumulator
      else
        helper(x-1,x*accumulator)
    }
    helper(x,1)
  }

}
object recursionAndTailRecursion {
  def main(args:Array[String])= {
    println(result.factorial(5))
    println(result.anotherFactorial(5))
  }

}
