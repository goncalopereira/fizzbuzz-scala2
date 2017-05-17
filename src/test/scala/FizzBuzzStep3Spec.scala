package com.equalexperts.fb

import org.scalatest._

class FizzBuzzStep3Spec extends FlatSpec with Matchers {

  behavior of "The FizzBuzz"

  val fb = new FizzBuzzStep3
  "Output" should "integer given 1" in {
    fb.output(1) shouldEqual FizzBuzzInteger(1)
  }

  it should "fizz given 3" in {
    fb.output(3) shouldEqual LuckyString()
  }

  it should "fizzbuzz given 6" in {
    fb.output(6) shouldEqual FizzString()
  }

  it should "buzz given 5" in {
    fb.output(5) shouldEqual BuzzString()
  }

  it should "fizzbuzz given 15" in {
    fb.output(15) shouldEqual FizzBuzzString()
  }

  it should "lucky given 13" in {
    fb.output(13) shouldEqual LuckyString()
  }

  "Generate" should "fizz and fizz count given fizz" in {
    fb.generate(IndexedSeq(FizzString())) shouldEqual Map[String, Int]("fizz" -> 1)
  }

  it should "integer and integer count given 1" in {
    fb.generate(IndexedSeq(FizzBuzzInteger(1))) shouldEqual Map[String, Int]("integer" -> 1)
  }

  "Report" should "fizz and fizz count given fizz" in {
    fb.report(IndexedSeq(FizzString())) shouldEqual IndexedSeq("fizz: 1")
  }

  it should "integer and integer count given 1" in {
    fb.report(IndexedSeq(FizzBuzzInteger(1))) shouldEqual IndexedSeq("integer: 1")
  }

  "Produce" should "integer given range one element" in {
    fb.produce(1, 1) shouldEqual "1 integer: 1"
  }

  it should "known string given known range" in {
    val knownRange = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10"

    fb.produce(1, 20) shouldEqual knownRange
  }
}
