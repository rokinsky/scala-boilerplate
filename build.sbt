name := "scala-boilerplate"

version := "0.1"

scalaVersion := "3.0.0"

// From https://tpolecat.github.io/2017/04/25/scalac-flags.html
scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-Xfatal-warnings",
  "-Ykind-projector",
  "-source:3.0-migration",
  "-rewrite",
  "-indent"
)

val http4sVersion         = "1.0.0-M21"
val circeVersion          = "0.13.0"
val circeConfigVersion    = "0.8.0"
val playVersion           = "2.8.2"
val doobieVersion         = "1.0.0-M2"
val catsVersion           = "2.6.0"
val catsTaglessVersion    = "0.11"
val catsEffectVersion     = "3.1.0"
val epimetheusVersion     = "0.4.2"
val catsScalacheckVersion = "0.2.0"

val akkaVersion          = "2.6.s9"
val akkaHttpVersion      = "10.1.11"
val akkaHttpCirceVersion = "1.31.0"

val log4CatsVersion = "2.1.0"

val scalaTestVersion = "3.1.0.0-RC2"
val h2Version        = "1.4.200"

libraryDependencies ++= Seq(
  "org.typelevel"     %% "cats-core"              % catsVersion cross CrossVersion.for3Use2_13,
  "org.typelevel"     %% "cats-effect-kernel"     % catsEffectVersion cross CrossVersion.for3Use2_13,
  "org.typelevel"     %% "cats-effect-std"        % catsEffectVersion cross CrossVersion.for3Use2_13,
  "org.typelevel"     %% "cats-effect"            % catsEffectVersion cross CrossVersion.for3Use2_13,
  "org.http4s"        %% "http4s-dsl"             % http4sVersion cross CrossVersion.for3Use2_13,
  "org.http4s"        %% "http4s-blaze-server"    % http4sVersion cross CrossVersion.for3Use2_13,
  "org.http4s"        %% "http4s-blaze-client"    % http4sVersion cross CrossVersion.for3Use2_13,
  "org.http4s"        %% "http4s-circe"           % http4sVersion cross CrossVersion.for3Use2_13,
  "org.http4s"        %% "http4s-jdk-http-client" % "0.5.0-M4" cross CrossVersion.for3Use2_13,
  "org.typelevel"     %% "log4cats-slf4j"         % log4CatsVersion cross CrossVersion.for3Use2_13,
  "ch.qos.logback"     % "logback-classic"        % "1.2.3",
  "io.chrisdavenport" %% "cats-scalacheck"        % catsScalacheckVersion % Test cross CrossVersion.for3Use2_13,
  "org.scalatestplus" %% "scalacheck-1-15"        % "3.2.9.0",
  "org.scalatest"     %% "scalatest"              % "3.2.9",
  "io.circe"          %% "circe-config"           % circeConfigVersion cross CrossVersion.for3Use2_13,
  "io.circe"          %% "circe-core"             % "0.14.0-M5" cross CrossVersion.for3Use2_13,
  "io.circe"          %% "circe-generic"          % "0.14.0-M5" cross CrossVersion.for3Use2_13,
  "io.circe"          %% "circe-generic-extras"   % circeVersion cross CrossVersion.for3Use2_13,
  "io.circe"          %% "circe-optics"           % circeVersion cross CrossVersion.for3Use2_13,
  "io.circe"          %% "circe-parser"           % "0.14.0-M5" cross CrossVersion.for3Use2_13,
  "org.tpolecat"      %% "doobie-core"            % doobieVersion cross CrossVersion.for3Use2_13,
  "org.tpolecat"      %% "doobie-h2"              % doobieVersion cross CrossVersion.for3Use2_13,
  "org.tpolecat"      %% "doobie-hikari"          % doobieVersion cross CrossVersion.for3Use2_13,
  "com.h2database"     % "h2"                     % "1.4.200" cross CrossVersion.disabled,
)

run / fork := true
