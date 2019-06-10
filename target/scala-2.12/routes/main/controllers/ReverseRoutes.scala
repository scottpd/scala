// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/scottp1/dev/scala/conf/routes
// @DATE:Mon Jun 10 14:30:24 SAST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
