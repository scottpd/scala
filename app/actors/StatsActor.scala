package actors

import actors.StatsActor.Ping
import actors.StatsActor.{GetStats, RequestReceived}
import akka.actor.Actor

class StatusActor extends Actor {
  var counter = 0

  override def receive: Receive = {
    case Ping => ()
    case RequestReceived => counter += 1
    case GetStats => sender() ! counter
  }
}
object StatsActor {

  val name = "statsActor"
  val path = s"/user/$name"

  case object Ping
  case object RequestReceived
  case object GetStats

}
