package controllers
import play.api.libs.json.JsObject
import play.api.libs.json.JsPath.\

import scala.language.dynamics
import javax.inject._
import play.api.mvc.{Action, _}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

class HomeController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def health = Action {
    Ok("Your new application is ready-Hello.")
  }

  def welcome(name:String,usn:Int)=Action {
    Ok(s"HI Iam $name and My usn is $usn")
  }

  def sayHello()=Action { request:Request[AnyContent] =>
    val json = request.body.asJson.getOrElse("{}",null).asInstanceOf[JsObject]
    if (json == null) BadRequest("Expecting Json data")
    else
    {
      if ((json \ "name").asOpt[String].isEmpty) BadRequest("Missing parameter [name]")
      else Ok("Hello " + (json \ "name").as[String])
    }
  }
}


