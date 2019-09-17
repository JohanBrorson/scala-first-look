package com.github.johanbrorson.training.scala

object Grades {
    
    def main(args:Array[String]) {
      val results = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
      for (grade <- results) printf("%3d -> %s\n", grade, getGrade(grade))
      println("Average: " + average(results))
    }
    
    def getGrade(result:Int) = {
      if (result >= 93) "A"
      else if (result >= 86) "B"
      else if (result >= 77) "C"
      else if (result >= 69) "D"
      else "F"
    }
    
    def average(results:List[Int]):Double = {
      results.foldLeft(0.0)(_ + _) / results.length
    }
}
