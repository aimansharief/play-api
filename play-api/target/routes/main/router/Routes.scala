// @GENERATOR:play-routes-compiler
// @SOURCE:/home/stpl/Downloads/play-api/conf/routes
// @DATE:Sat Aug 27 20:37:20 IST 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    HomeController_0: controllers.HomeController
  ) = this(errorHandler, HomeController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """health""", """controllers.HomeController.health"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """welcome/""" + "$" + """name<[^/]+>/""" + "$" + """usn<[^/]+>""", """controllers.HomeController.welcome(name:String, usn:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sayHello""", """controllers.HomeController.sayHello"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_HomeController_health0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("health")))
  )
  private[this] lazy val controllers_HomeController_health0_invoker = createInvoker(
    HomeController_0.health,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "health",
      Nil,
      "GET",
      this.prefix + """health""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_HomeController_welcome1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("welcome/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("usn", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_welcome1_invoker = createInvoker(
    HomeController_0.welcome(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "welcome",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """welcome/""" + "$" + """name<[^/]+>/""" + "$" + """usn<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_HomeController_sayHello2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sayHello")))
  )
  private[this] lazy val controllers_HomeController_sayHello2_invoker = createInvoker(
    HomeController_0.sayHello,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sayHello",
      Nil,
      "POST",
      this.prefix + """sayHello""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_HomeController_health0_route(params@_) =>
      call { 
        controllers_HomeController_health0_invoker.call(HomeController_0.health)
      }
  
    // @LINE:3
    case controllers_HomeController_welcome1_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromPath[Int]("usn", None)) { (name, usn) =>
        controllers_HomeController_welcome1_invoker.call(HomeController_0.welcome(name, usn))
      }
  
    // @LINE:4
    case controllers_HomeController_sayHello2_route(params@_) =>
      call { 
        controllers_HomeController_sayHello2_invoker.call(HomeController_0.sayHello)
      }
  }
}
