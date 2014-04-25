package scala.service

import com.yammer.dropwizard.ScalaService
import com.yammer.dropwizard.config.{Environment, Bootstrap}
import com.yammer.dropwizard.bundles.ScalaBundle
import scala.service.resources.HelloWorldResouce

/**
 * Created by saumil on 2014/04/24.
 */
object SimpleService extends ScalaService[SimpleServiceConfiguration]{

  def initialize(bootstrap: Bootstrap[SimpleServiceConfiguration]){
    bootstrap.setName("simple-scala")
    bootstrap.addBundle(new ScalaBundle)
  }

  def run(configuration: SimpleServiceConfiguration, environment: Environment ){
    environment.addResource(new HelloWorldResouce(configuration template, configuration defaultName))
  }

}
