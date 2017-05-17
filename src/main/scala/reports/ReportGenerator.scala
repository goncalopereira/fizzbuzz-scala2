package com.equalexperts.fb

trait ReportGenerator {

  def generate(outputs: IndexedSeq[FizzBuzzValue]): Map[String, Int] = {
    outputs.foldLeft(Map[String, Int]()) {
      (reportMap, output) =>
        output match {
          case FizzBuzzInteger(_) => reportMap + (
            OutputTypes.Integer -> (reportMap.getOrElse(OutputTypes.Integer, 0) + 1)
          )
          case value => reportMap + (
            value.toString() -> (reportMap.getOrElse(value.toString(), 0) + 1)
          )
        }
    }
  }
}
