package com.paramesh

import org.scalatest.FunSuite
import com.paramesh.WordCount._

class WordCountTests extends FunSuite {

  test("Check word count work correct") {
    val actualResult = wordCounter("a b a b c d d e f")
    val expectedResult = Map("e" -> 1, "f" -> 1, "a" -> 2, "b" -> 2, "c" -> 1, "d" -> 2)
    assert(actualResult==expectedResult)
  }

}
