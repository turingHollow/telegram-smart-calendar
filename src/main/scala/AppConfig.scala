import zio.ZLayer
import zio.config._
import zio.config.typesafe._
import zio.config.magnolia._


case class AppConfig(telegramToken: String)

object AppConfig {

  val layer: ZLayer[Any, ReadError[String], AppConfig] = {
    val configSource =
      ConfigSource
        .fromHoconFile(new java.io.File("src/main/resources", "reference.conf"))
    ZLayer.fromZIO(read(descriptor[AppConfig] from configSource))
  }
}