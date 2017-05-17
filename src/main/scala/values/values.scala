package com.equalexperts.fb

abstract class FizzBuzzValue
case class FizzBuzzInteger(i: Integer) extends FizzBuzzValue {
  override def toString(): String = { i.toString() }
}
case class FizzString() extends FizzBuzzValue {
  override def toString(): String = { "fizz" }
}
case class BuzzString() extends FizzBuzzValue {
  override def toString(): String = { "buzz" }
}
case class FizzBuzzString() extends FizzBuzzValue {
  override def toString(): String = { "fizzbuzz" }
}
case class LuckyString() extends FizzBuzzValue {
  override def toString(): String = { "lucky" }
}
