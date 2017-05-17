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
            value.toString() -> (reportMap.getOrElse(value.toString(), 0) + 1)
          )
        }
    }
  }
}
