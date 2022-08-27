// @GENERATOR:play-routes-compiler
// @SOURCE:/home/stpl/Downloads/play-api/conf/routes
// @DATE:Sat Aug 27 20:37:20 IST 2022

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
