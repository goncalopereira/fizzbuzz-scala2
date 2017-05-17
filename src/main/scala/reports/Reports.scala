package com.equalexperts.fb

trait Reports
    extends ReportGenerator {
  val reportOrder = IndexedSeq(
    "fizz",
    "buzz",
    "fizzbuzz",
    "lucky",
    "integer"
  )

  def report(outputs: IndexedSeq[FizzBuzzValue]): IndexedSeq[String] = {
    val outputReport = generate(outputs)

    sortedReportToStrings(outputReport)
  }

  private def sortedReportToStrings(outputReport: Map[String, Int]): IndexedSeq[String] = {
    val existingReportOrder = reportOrder.filter(outputReport.contains(_))

    existingReportOrder
      .map(key => augmentString("%s: %s").format(key, outputReport(key)))
  }
}
