package controllers


import com.typesafe.config.ConfigFactory
import scala.collection.mutable
import org.scalatestplus.play._

class ControllerSpec extends PlaySpec {
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
