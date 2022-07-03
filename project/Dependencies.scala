import sbt._

object Dependencies {

  lazy val config = Seq(
    "dev.zio" %% "zio-config" % "3.0.0-RC9",
    "dev.zio" %% "zio-config-magnolia" % "3.0.0-RC9")

  lazy val zio = Seq(
    "dev.zio" %% "zio" % "2.0.0-RC6"
  )

  val all = zio ++ config
}
