package com.equalexperts.fb

trait OutputWithLucky extends Output {

  def contains3(value: Int): Boolean = value.toString contains "3"

  override def output(value: Int): FizzBuzzValue = {
    if (contains3(value)) FizzBuzzString("lucky") else super.output(value)
  }
}
