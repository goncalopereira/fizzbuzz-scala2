package com.equalexperts.fb

class FizzBuzz extends Output {
  def produce(first: Int, last: Int): String = {
    val outputs = mapRangeToOutput(first, last)
    val outputsStrings = outputs.map(_.toString)

    outputsStrings.mkString(" ")
  }

  protected def mapRangeToOutput(first: Int, last: Int): IndexedSeq[FizzBuzzValue] = {
    (first to last)
      .map(output(_))
  }
}
