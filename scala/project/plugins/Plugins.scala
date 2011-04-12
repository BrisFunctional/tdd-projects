import sbt._

/**
 * Created by IntelliJ IDEA.
 * User: mjg
 * Date: 12/04/11
 * Time: 19:05
 * To change this template use File | Settings | File Templates.
 */


class Plugins(info: ProjectInfo) extends PluginDefinition(info) {

  lazy val stax = "eu.getintheloop" % "sbt-stax-plugin" % "0.1.2"

  // repos
  lazy val staxReleases = "stax-release-repo" at "http://mvn.stax.net/content/repositories/public"
}