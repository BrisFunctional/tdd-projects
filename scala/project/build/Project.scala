/**
 * Created by IntelliJ IDEA.
 * User: Matthew
 * Date: 12/04/11
 * Time: 19:02
 */

import sbt._

class SuperSimpleProject(info: ProjectInfo) extends DefaultProject(info) {

  /**
   * Application dependencies
   */
  val junit = "junit" % "junit" % "4.5" % "test->default"
  val specs = "org.scala-tools.testing" %% "specs" % "1.6.6" % "test->default"


  object Repositories {
    lazy val MavenLocal = MavenRepository("local.repo", "file://" + Path.userHome + "/.m2/repository")
    lazy val MavenCentral = MavenRepository("central.repo", "http://repo1.maven.org/maven2/")
    lazy val JBossRepo = MavenRepository("jboss.repo", "http://repository.jboss.org/nexus/content/groups/public-jboss/")
    lazy val TwitterRepo = MavenRepository("twitter.repo", "http://maven.twttr.com/")
    lazy val ScalaToolsReleases = MavenRepository("scala-tools.releases", "http://scala-tools.org/repo-releases/")
    lazy val ScalaToolsSnapshots = MavenRepository("scala-tools.snapshots", "http://scala-tools.org/repo-snapshots/")
    lazy val SonatypeRepo = MavenRepository("oss.sonatype.org", "http://oss.sonatype.org/content/groups/github/")
    lazy val AkkaRepo = MavenRepository("akka.repo", "http://akka.io/repository/")
    lazy val GuiceyFruitRepo = MavenRepository("guiceyfruit.repo", "http://guiceyfruit.googlecode.com/svn/repo/releases/")
  }

  import Repositories._

  // module Configurations
  lazy val localMavenRepo = MavenLocal
  lazy val liftModuleConfig = ModuleConfiguration("net.liftweb", ScalaToolsReleases)
  lazy val scalaTestModuleConfig = ModuleConfiguration("org.scalatest", ScalaToolsReleases)
  lazy val specsModuleConfig = ModuleConfiguration("org.scala-tools.testing", ScalaToolsReleases)
  lazy val akkaModuleConfig = ModuleConfiguration("se.scalablesolutions.akka", AkkaRepo)
  lazy val uuidModuleConfig = ModuleConfiguration("com.eaio", AkkaRepo)
  lazy val sbinaryModuleConfig = ModuleConfiguration("sbinary", AkkaRepo)
  lazy val jsr166xModuleConfig = ModuleConfiguration("jsr166x", AkkaRepo)
  lazy val voldemortModuleConfig = ModuleConfiguration("voldemort.store.compress", AkkaRepo)
  lazy val sjsonModuleConfig = ModuleConfiguration("sjson.json", AkkaRepo)
  lazy val nettyModuleConfig = ModuleConfiguration("org.jboss.netty", JBossRepo)
  lazy val aspeketModuleConfig = ModuleConfiguration("org.codehaus.aspectwerkz", AkkaRepo)
  lazy val twitterModuleConfig = ModuleConfiguration("com.twitter", TwitterRepo)
  lazy val lagNetCustModuleConfig = ModuleConfiguration("net.lag", "configgy", "2.0.2-nologgy", AkkaRepo)
  lazy val lagNetModuleConfig = ModuleConfiguration("net.lag", "configgy", "2.0.2", TwitterRepo)
  lazy val hibernateModuleConfig = ModuleConfiguration("org.hibernate", JBossRepo)
  lazy val javaxPersModuleConfig = ModuleConfiguration("org.hibernate.javax.persistence", JBossRepo)
  lazy val jettyModuleConfig = ModuleConfiguration("org.eclipse.jetty", DefaultMavenRepository)
  lazy val guiceyFruitModuleConfig = ModuleConfiguration("org.guiceyfruit", GuiceyFruitRepo)
  lazy val jbossModuleConfig = ModuleConfiguration("org.jboss", JBossRepo)
  lazy val logbackModuleConfig = ModuleConfiguration("ch.qos.logback", sbt.DefaultMavenRepository)

}