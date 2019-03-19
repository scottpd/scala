// @GENERATOR:play-routes-compiler
// @SOURCE:/home/scottp1/dev/scala-web-project/conf/routes
// @DATE:Tue Mar 19 09:15:11 SAST 2019


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
