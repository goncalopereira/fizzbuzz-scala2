package com.equalexperts.fb

trait ReportGenerator {

  def generate(outputs: IndexedSeq[FizzBuzzValue]): Map[String, Int] = {
    outputs.foldLeft(Map[String, Int]()) {
      (reportMap, output) =>
        output match {
          case _: FizzBuzzInteger => reportMap + ("integer" -> (reportMap.getOrElse("integer", 0) + 1))
          case value: FizzBuzzString => reportMap + (value.toValue -> (reportMap.getOrElse(value.toValue(), 0) + 1))
        }
    }
  }
}
