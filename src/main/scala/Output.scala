package com.equalexperts.fb

trait Output {
  val Fizz: String = "fizz"
  val Buzz: String = "buzz"
  val FizzBuzz: String = "fizzbuzz"

  def isMultipleOf3(value: Int): Boolean = value % 3 equals 0
  def isMultipleOf5(value: Int): Boolean = value % 5 equals 0

  def output(value: Int): Either[Int, String] = value match {
    case _ if isMultipleOf3(value) && isMultipleOf5(value) => Right(FizzBuzz)
    case _ if isMultipleOf3(value) => Right(Fizz)
    case _ if isMultipleOf5(value) => Right(Buzz)
    case _ => Left(value)
  }
}
