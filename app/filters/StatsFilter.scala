package filters


import actors.StatsActor
import akka.actor.ActorSystem
import akka.stream.Materializer
import play.api.Logger
import play.api.mvc.{Filter, RequestHeader, Result}

class StatsFilter(actorSystem: ActorSystem, implicit val mat: Materializer) extends Filter{

  private val log = Logger(this.getClass)

  override def apply(nextFilter: RequestHeader => concurrent.Future[Result])(header: RequestHeader): concurrent.Future[Result] = {
    log.info(s"Serving another request: ${header.path}")
    actorSystem.actorSelection(StatsActor.path) ! StatsActor.RequestReceived
    nextFilter(header)
  }

}
