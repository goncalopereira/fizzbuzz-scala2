package com.equalexperts.fb

import org.scalatest._

class FizzBuzzStep2Spec extends FlatSpec with Matchers {

  behavior of "The FizzBuzz"

  val fb: FizzBuzzStep2 = new FizzBuzzStep2

  "Output" should "integer given 1" in {
    fb.output(1) shouldEqual FizzBuzzInteger(1)
  }

  it should "lucky given 3" in {
    fb.output(3) shouldEqual FizzBuzzString("lucky")
  }

  it should "fizz given 6" in {
    fb.output(6) shouldEqual FizzBuzzString("fizz")
  }

  it should "buzz given 5" in {
    fb.output(5) shouldEqual FizzBuzzString("buzz")
  }

  it should "fizzbuzz given 15" in {
    fb.output(15) shouldEqual FizzBuzzString("fizzbuzz")
  }

  it should "lucky given 13" in {
    fb.output(13) shouldEqual FizzBuzzString("lucky")
  }

  "Produce" should "integer given range one element" in {
    fb.produce(1, 1) shouldEqual "1"
  }

  it should "known string given known range" in {
    val knownRange = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"

    fb.produce(1, 20) shouldEqual knownRange
  }
}
