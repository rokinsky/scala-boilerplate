package rokinsky.hello

import cats.effect.std.Console
import cats.effect.{IO, IOApp}
import cats.Monad
import cats.syntax.functor.toFunctorOps
import cats.syntax.flatMap.toFlatMapOps

import Hello._

def app[F[_]: Monad: Console]: F[Unit] =
  for
    _ <- Console[F].println(helloMethod("Arseni"))
    _ <- Console[F].println(helloFunction("Piotrek"))
  yield ()

object HelloApp extends IOApp.Simple:
  def run = app[IO]
