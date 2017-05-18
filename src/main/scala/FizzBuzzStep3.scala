package com.equalexperts.fb

class FizzBuzzStep3
    extends FizzBuzzStep2
    with Reports {

  override def produce(first: Int, last: Int): String = {
    val outputs = mapRangeToOutput(first, last)

    val outputsReport = report(outputs)

    val outputsStrings = outputs.map(_.toValue())

    (outputsStrings ++ outputsReport)
      .mkString(" ")
  }
}
