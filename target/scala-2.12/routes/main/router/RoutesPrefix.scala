// @GENERATOR:play-routes-compiler
// @SOURCE:/opt/jemstep/code/scala-web-project/conf/routes
// @DATE:Fri Mar 15 13:45:52 UTC 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
