package controllers

import controllers.Assets.Asset
import play.api.mvc._
import services.{SunService, WeatherService}

import scala.concurrent.ExecutionContext.Implicits.global

//552c84c51edbbdca9c37044993b797c0

class Application (components: ControllerComponents, assets: Assets, sunService: SunService, weatherService: WeatherService)
  extends AbstractController(components) {

  def index = Action.async {

    val lat = -26.106317
    val lon = 28.057097

    val sunInfoF = sunService.getSunInfo(lat, lon)
    val temperatureF = weatherService.getTemperature(lat, lon)
    for{
      sunInfo <- sunInfoF
      temperature <- temperatureF
    } yield{
      Ok(views.html.index(sunInfo, temperature))
    }

  }

  def versioned(path: String, file: Asset) = assets.versioned(path, file)
}
