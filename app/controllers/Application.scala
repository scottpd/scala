package controllers

import java.util.concurrent.TimeUnit

import actors.StatsActor
import akka.actor.ActorSystem
import controllers.Assets.Asset
import play.api.mvc._
import services.{SunService, WeatherService}
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.ExecutionContext.Implicits.global

//552c84c51edbbdca9c37044993b797c0

class Application (components: ControllerComponents, assets: Assets, sunService: SunService, weatherService: WeatherService, actorSystem: ActorSystem)
  extends AbstractController(components) {

  def index = Action.async {

    val lat = -26.106317
    val lon = 28.057097

    val sunInfoF = sunService.getSunInfo(lat, lon)
    val temperatureF = weatherService.getTemperature(lat, lon)
    implicit val timeout = Timeout(5, TimeUnit.SECONDS)
    val requestsF = (actorSystem.actorSelection(StatsActor.path) ? StatsActor.GetStats).mapTo[Int]
    for{
      sunInfo <- sunInfoF
      temperature <- temperatureF
      requests <- requestsF
    } yield{
      Ok(views.html.index(sunInfo, temperature, requests))
    }

  }

  def versioned(path: String, file: Asset) = assets.versioned(path, file)
}
