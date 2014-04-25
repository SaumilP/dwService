package scala.service

import com.yammer.dropwizard.config.Configuration
import org.hibernate.validator.constraints.NotEmpty
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by saumil on 2014/04/24.
 */
class SimpleServiceConfiguration extends Configuration {

  @NotEmpty
  @JsonProperty
  val template: String = "Greetings, %s!"

  @NotEmpty
  @JsonProperty
  val defaultName: String = "Guest"
}
