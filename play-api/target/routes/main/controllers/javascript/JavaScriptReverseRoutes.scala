// @GENERATOR:play-routes-compiler
// @SOURCE:/home/stpl/Downloads/play-api/conf/routes
// @DATE:Sat Aug 27 20:37:20 IST 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def sayHello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sayHello",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sayHello"})
        }
      """
    )
  
    // @LINE:2
    def health: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.health",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "health"})
        }
      """
    )
  
    // @LINE:3
    def welcome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.welcome",
      """
        function(name0,usn1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "welcome/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("usn", usn1))})
        }
      """
    )
  
  }


}
