// @GENERATOR:play-routes-compiler
// @SOURCE:/home/stpl/Downloads/play-api/conf/routes
// @DATE:Sat Aug 27 20:37:20 IST 2022


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
