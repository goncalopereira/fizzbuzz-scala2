package com.equalexperts.fb

trait ReportGenerator {

  def generate(outputs: IndexedSeq[FizzBuzzValue]): Map[String, Int] = {
    outputs.foldLeft(Map[String, Int]()) {
      (reportMap, output) =>
        output match {
          case FizzBuzzInteger(_) => reportMap + (
            "integer" -> (reportMap.getOrElse("integer", 0) + 1)
          )
          case value => reportMap + (
            value.toValue -> (reportMap.getOrElse(value.toValue, 0) + 1)
          )
        }
    }
  }
}
