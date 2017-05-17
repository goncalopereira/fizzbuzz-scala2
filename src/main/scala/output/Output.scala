package com.equalexperts.fb

trait Output {
  def isMultipleOf3(value: Int): Boolean = value % 3 equals 0
  def isMultipleOf5(value: Int): Boolean = value % 5 equals 0

  def output(value: Int): FizzBuzzValue = value match {
    case _ if isMultipleOf3(value) && isMultipleOf5(value) => FizzBuzzString("fizzbuzz")
    case _ if isMultipleOf3(value) => FizzBuzzString("fizz")
    case _ if isMultipleOf5(value) => FizzBuzzString("buzz")
    case _ => FizzBuzzInteger(value)
  }
}
