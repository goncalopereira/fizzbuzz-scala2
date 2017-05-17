package com.equalexperts.fb

trait Reports
    extends ReportGenerator {
  val reportOrder = IndexedSeq(
    OutputTypes.Fizz,
    OutputTypes.Buzz,
    OutputTypes.FizzBuzz,
    OutputTypes.Lucky,
    OutputTypes.Integer
  )

  def report(outputs: IndexedSeq[FizzBuzzValue]): IndexedSeq[String] = {
    val outputReport = generate(outputs)

    sortedReportToStrings(outputReport)
  }

  private def sortedReportToStrings(outputReport: Map[String, Int]): IndexedSeq[String] = {
    val existingReportOrder = reportOrder.filter(outputReport.contains(_))

    existingReportOrder
      .map { case key => "%s: %s" format (key, outputReport(key)) }
  }
}
