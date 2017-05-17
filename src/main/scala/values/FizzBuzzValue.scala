package com.equalexperts.fb

sealed abstract class FizzBuzzValue {
  def toValue(): String
}
final case class FizzBuzzInteger(i: Integer) extends FizzBuzzValue {
  def toValue(): String = i.toString()
}
final case class FizzBuzzString(s: String) extends FizzBuzzValue {
  def toValue(): String = s
}
