package com.github.johanbrorson.training.scala

object Movies {
  var movies = Map("The Shawshank Redemption" -> "R",
  								 "Frozen" -> "PG",
  								 "Moana" -> "PG")
                                                  //> movies  : scala.collection.immutable.Map[String,String] = Map(The Shawshank
                                                  //| Redemption -> R, Frozen -> PG, Moana -> PG)

  val printMap = (map: Map[String, String]) => {
    map.foreach{case (a, b) => println(a + ": " + b) }
  }                                               //> printMap  : Map[String,String] => Unit = com.github.johanbrorson.training.sc
                                                  //| ala.Movies$$$Lambda$11/159259014@7f560810

  printMap(movies)                                //> The Shawshank Redemption: R
                                                  //| Frozen: PG
                                                  //| Moana: PG

  movies += ("Harry Potter and the Deathly Hallows: Part 1" -> "PG-13")

  printMap(movies)                                //> The Shawshank Redemption: R
                                                  //| Frozen: PG
                                                  //| Moana: PG
                                                  //| Harry Potter and the Deathly Hallows: Part 1: PG-13

}
