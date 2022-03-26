class SpecA extends munit.FunSuite {
  test("suite1 fast") {
    assertEquals(true, true)
  }
  test("suite1 slow") {
    Thread.sleep(2000)
    assertEquals(true, true)
  }
}

class SpecB extends munit.FunSuite {
  test("suite2 fast") {
    assertEquals(true, true)
  }
  test("suite2 slow") {
    Thread.sleep(5000)
    assertEquals(true, true)
  }
  test("suite2 slow") {
    Thread.sleep(10000)
    assertEquals(true, true)
  }
}

