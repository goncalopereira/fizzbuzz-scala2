package com.equalexperts.fb

sealed abstract class FizzBuzzValue {
  def toValue(): String
}
final case class FizzBuzzInteger(i: Integer) extends FizzBuzzValue {
  def toValue(): String = i.toString()
}
case object FizzString extends FizzBuzzValue {
  def toValue(): String = "fizz"
}
case object BuzzString extends FizzBuzzValue {
  def toValue(): String = "buzz"
}
case object FizzBuzzString extends FizzBuzzValue {
  def toValue(): String = "fizzbuzz"
}
case object LuckyString extends FizzBuzzValue {
  def toValue(): String = "lucky"
}
