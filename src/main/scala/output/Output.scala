package com.equalexperts.fb

trait Output {
  def isMultipleOf3(value: Int): Boolean = value % 3 equals 0
  def isMultipleOf5(value: Int): Boolean = value % 5 equals 0

  def output(value: Int): FizzBuzzValue = value match {
    case _ if isMultipleOf3(value) && isMultipleOf5(value) => FizzBuzzString()
    case _ if isMultipleOf3(value) => FizzString()
    case _ if isMultipleOf5(value) => BuzzString()
    case _ => FizzBuzzInteger(value)
  }
}
