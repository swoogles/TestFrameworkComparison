import weaver.SimpleIOSuite
import cats.effect._

import scala.concurrent.duration.DurationInt

// Suites must be "objects" for them to be picked by the framework
object ASuite extends SimpleIOSuite {

  test("quick test") {
    for {
      _ <- Temporal[IO].sleep(0.seconds)
    } yield expect(true)
  }

  test("slow test") {
    for {
      _ <- Temporal[IO].sleep(3.seconds)
    } yield expect(true)
  }

}

object BSuite extends SimpleIOSuite {

  test("quick test") {
    for {
      _ <- Temporal[IO].sleep(0.seconds)
    } yield expect(true)
  }

  test("slow test") {
    for {
      _ <- Temporal[IO].sleep(3.seconds)
    } yield expect(true)
  }

}
