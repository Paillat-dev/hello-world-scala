val scala3Version = "3.7.1"

lazy val root = project
  .in(file("."))
  .settings(
    name              := "hello-world-scala",
    version           := "0.1.0-SNAPSHOT",
    scalaVersion      := scala3Version,
    semanticdbEnabled := true,
    scalacOptions += "-Wunused:all",
    javaOptions += "-Dfile.encoding=UTF-8",
    javaOptions += "-Dstdout.encoding=UTF-8",
    javaOptions += "-Dstderr.encoding=UTF-8",
    libraryDependencies += "com.lihaoyi" %% "fansi" % "0.5.0"
  )
