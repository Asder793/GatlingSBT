name := "GatlingSBT"

version := "0.1"

scalaVersion := "2.12.8"

enablePlugins(GatlingPlugin)
scalaVersion := "2.12.8"
scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.8", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.0.3" % "test,it"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "3.0.3" % "test,it"
libraryDependencies += "io.gatling" % "gatling-http" % "3.0.3"
libraryDependencies += "io.gatling" % "gatling-core" % "3.0.3"