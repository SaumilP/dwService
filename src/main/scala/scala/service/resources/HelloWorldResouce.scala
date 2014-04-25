package scala.service.resources

import javax.ws.rs._
import java.util.concurrent.atomic.AtomicLong
import com.yammer.metrics.annotation.Timed
import scala.service.core.Welcome

/**
 * Created by saumil on 2014/04/24.
 */

@Path("/hello-world")
@Produces(Array("application/json"))
class HelloWorldResouce(val template: String ,val defaultName: String) {
  private val counter: AtomicLong = new AtomicLong

  @GET
  @Timed
  @Path("/{name}")
  def sayHello(@PathParam("name") name: String): Welcome =
    new Welcome(counter.incrementAndGet(), String.format(name))


}
