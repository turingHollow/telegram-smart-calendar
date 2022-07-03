import zio._
import zio.Console._
import zio.config._


import java.io.IOException

object Main extends zio.ZIOAppDefault {

  def run = program.provideLayer(AppConfig.layer)

  val program: ZIO[AppConfig, IOException, Unit] =
    for {
      config <- getConfig[AppConfig]
      _ <- printLine(s"Config is $config")
    } yield ()
}