// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/scottp1/dev/scala/conf/routes
// @DATE:Mon Jun 10 14:30:24 SAST 2019


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
