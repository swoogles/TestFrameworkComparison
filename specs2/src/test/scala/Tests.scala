import org.specs2.mutable._

class SpecA extends Specification {
  "Specs2 class A" >> {
    "quick test" >> {
      success
    }

    "slow test" >> {
      Thread.sleep(3000)
      failure
    }
  }
}

class SpecB extends Specification {

  "Specs2 class B" >> {
    "quick test" >> {
      success
    }

    "slow test" >> {
      Thread.sleep(3000)
      success
    }
  }
}
