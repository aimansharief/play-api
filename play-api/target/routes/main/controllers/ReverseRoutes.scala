// @GENERATOR:play-routes-compiler
// @SOURCE:/home/stpl/Downloads/play-api/conf/routes
// @DATE:Sat Aug 27 20:37:20 IST 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def sayHello(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "sayHello")
    }
  
    // @LINE:2
    def health(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "health")
    }
  
    // @LINE:3
    def welcome(name:String, usn:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "welcome/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("usn", usn)))
    }
  
  }


}
