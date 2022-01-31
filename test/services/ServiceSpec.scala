package services

import org.scalatestplus.play.PlaySpec

import scala.collection.mutable

class ServiceSpec extends PlaySpec{

  "A Stack" must {
    "pop values in last-in-first-out order" in {
      val stack = new mutable.Stack[Int]
      stack.push(1)
      stack.push(2)
      stack.pop() mustBe 2
      stack.pop() mustBe 1
    }
  }
}
