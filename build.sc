import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object HelloWorld extends ScalaModule {
    def scalaVersion = "2.12.11"

    // pass options to the scalac compiler? (not working)
    //def scalacOptions = super.scalacOptions() ++ Seq(
    //    "-feature", "-deprecation"
    //)

    // pass options to the scalac compiler? (not working)
    //def scalacOptions = Seq(
    //    "-deprecation",
    //    "-feature"
    //)

    // for the HelloWorld/test directory
    object test extends Tests {
        def ivyDeps = Agg(
            ivy"org.scalactic::scalactic:3.1.1",
            ivy"org.scalatest::scalatest:3.1.1"
        )
        def testFrameworks = Seq("org.scalatest.tools.Framework")
    }
}


