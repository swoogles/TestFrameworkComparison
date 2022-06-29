import zio._
import zio.test._

object ExampleSpec extends ZIOSpec[Unit] {
  override val bootstrap =
    ZLayer.fromZIO(
      ZIO.acquireRelease(ZIO.debug("============================\n" + new Exception("tracing").getStackTrace.mkString("\n") + "\n\n"))(_ => ZIO.debug("Goodbye"))
    )

  def spec =
    test("test")(assertTrue(true))
}

