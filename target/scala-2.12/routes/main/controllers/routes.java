// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/scottp1/dev/scala/conf/routes
// @DATE:Mon Jun 10 14:30:24 SAST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
