class SpecA extends munit.FunSuite {
  test("suite1 fast") {
    assertEquals(true, true)
  }
  test("suite1 slow") {
    Thread.sleep(3000)
    assertEquals(true, true)
  }
}

class SpecB extends munit.FunSuite {
  test("suite1 fast") {
    assertEquals(true, true)
  }
  test("suite1 slow") {
    Thread.sleep(3000)
    assertEquals(true, true)
  }
}
