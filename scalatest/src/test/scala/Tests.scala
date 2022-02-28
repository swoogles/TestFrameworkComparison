import org.scalatest._
import flatspec._
import matchers._

class SpecA extends AnyFlatSpec with should.Matchers {

  it should "quick test" in {
    true shouldBe true
  }

  it should "slow test" in {
    Thread.sleep(3000)
    true shouldBe true
  }
}


class SpecB extends AnyFlatSpec with should.Matchers {

  it should "quick test" in {
    true shouldBe true
  }

  it should "slow test" in {
    Thread.sleep(3000)
    true shouldBe false
  }
}
