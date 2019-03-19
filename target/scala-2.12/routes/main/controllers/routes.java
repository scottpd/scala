// @GENERATOR:play-routes-compiler
// @SOURCE:/opt/jemstep/code/scala-web-project/conf/routes
// @DATE:Fri Mar 15 13:45:52 UTC 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
