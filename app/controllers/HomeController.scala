package controllers

import play.api.mvc._

import javax.inject.Inject

class HomeController @Inject()(cc:ControllerComponents) extends AbstractController(cc){

  def index = Action {
    Ok("something")
  }
}
