package com.equalexperts.fb

class FizzBuzz extends Output {
  def produce(first: Int, last: Int): String = {
    val outputs = mapRangeToOutput(first, last)
    val outputsStrings = outputToStrings(outputs)

    outputsStrings.mkString(" ")
  }

  protected def mapRangeToOutput(first: Int, last: Int): IndexedSeq[Either[Int, String]] = {
    (first to last)
      .map(output(_))
  }

  protected def outputToStrings(outputs: IndexedSeq[Either[Int, String]]): IndexedSeq[String] = {
    outputs.map {
      case Left(value) => value.toString
      case Right(value) => value
    }
  }
}