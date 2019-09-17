package com.github.johanbrorson.training.scala

object Calculator {

  def main(args:Array[String]) {
    val a = 10
    val b = 5
    println(addition(a, b))
    println(quotient(a, b))
    println(times(a, b))
    println(minus(a, b))
  }
  
  def addition(a:Int, b:Int) = a + b
  def quotient(a:Int, b:Int) = if (b == 0) 0 else a / b
  def times(a:Int, b:Int) = a * b
  def minus(a:Int, b:Int) = a - b

}
