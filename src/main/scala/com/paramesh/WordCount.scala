package com.paramesh


object WordCount extends App {

  def wordCounter(words: String) = {
    words
      .split(" ")
      .groupBy(x => x)
      .map(t => t._1 -> t._2.length)
  }

  wordCounter("a b a b c d d e f").map(println)
}