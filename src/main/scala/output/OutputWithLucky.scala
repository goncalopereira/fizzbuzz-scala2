package com.equalexperts.fb

trait OutputWithLucky extends Output {

  val Lucky: String = "lucky"

  def contains3(value: Int): Boolean = value.toString contains "3"

  override def output(value: Int): Either[Int, String] = {
    if (contains3(value)) Right(Lucky) else super.output(value)
  }
}
