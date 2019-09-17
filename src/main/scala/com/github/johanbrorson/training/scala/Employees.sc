package com.github.johanbrorson.training.scala

import scala.util.Properties

object Employees {

  case class Employee(id: Int, firstName: String, lastName: String) {
    override def toString: String = {
      "Employee ID: " + id + Properties.lineSeparator + "Full Name: " + firstName + " " + lastName
    }
  }

  var employees = List(Employee(12345, "David", "Bowie"),
                       Employee(12312, "David", "Bowie"),
  )                                               //> employees  : List[com.github.johanbrorson.training.scala.Employees.Employee]
                                                  //|  = List(Employee ID: 12345
                                                  //| Full Name: David Bowie, Employee ID: 12312
                                                  //| Full Name: David Bowie)

  employees.foreach(println)                      //> Employee ID: 12345
                                                  //| Full Name: David Bowie
                                                  //| Employee ID: 12312
                                                  //| Full Name: David Bowie
}
