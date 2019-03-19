package services

import play.api.libs.ws.WSClient

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class WeatherService(wsClient: WSClient) {

  def getTemperature(lat: Double, lon: Double): Future[Double] = {
    val weatherResponseF = wsClient.url(s"http://api.openweathermap.org/data/2.5/weather?lat=$lat&lon=$lon&units=metric&appid=552c84c51edbbdca9c37044993b797c0").get()
    weatherResponseF.map{ weatherResponse =>
      (weatherResponse.json \ "main" \ "temp").as[Double]
    }
  }

}
