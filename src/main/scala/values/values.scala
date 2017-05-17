package com.equalexperts.fb

abstract class FizzBuzzValue {
  def toValue(): String
}
case class FizzBuzzInteger(i: Integer) extends FizzBuzzValue {
  def toValue(): String = { i.toString() }
}
case class FizzString() extends FizzBuzzValue {
  def toValue(): String = { "fizz" }
}
case class BuzzString() extends FizzBuzzValue {
  def toValue(): String = { "buzz" }
}
case class FizzBuzzString() extends FizzBuzzValue {
  def toValue(): String = { "fizzbuzz" }
}
case class LuckyString() extends FizzBuzzValue {
  def toValue(): String = { "lucky" }
}
