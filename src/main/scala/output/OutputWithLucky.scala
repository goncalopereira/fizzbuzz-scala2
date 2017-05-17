package com.equalexperts.fb

trait OutputWithLucky extends Output {

  def contains3(value: Int): Boolean = value.toString contains "3"

  override def output(value: Int): Either[Int, String] = {
    if (contains3(value)) Right(OutputTypes.Lucky) else super.output(value)
  }
}
