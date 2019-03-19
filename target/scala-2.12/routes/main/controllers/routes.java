// @GENERATOR:play-routes-compiler
// @SOURCE:/home/scottp1/dev/scala-web-project/conf/routes
// @DATE:Tue Mar 19 09:15:11 SAST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
