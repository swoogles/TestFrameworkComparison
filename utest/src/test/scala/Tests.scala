
import utest._

object SpecA extends TestSuite{
  val tests =  Tests{
    val x = 1
    test("suite1"){
      test("fast test"){
        assert(true)
      }
      test("slow test"){
        Thread.sleep(3000)
        assert(true)
      }
    }
  }
}

object SpecB extends TestSuite{
  val tests =  Tests{
    val x = 1
    test("suite1"){
      test("fast test"){
        assert(true)
      }
      test("slow test"){
        Thread.sleep(3000)
        assert(true)
      }
    }
  }
}
