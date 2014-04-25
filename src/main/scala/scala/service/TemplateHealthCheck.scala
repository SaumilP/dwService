package scala.service

import com.yammer.metrics.core.HealthCheck
import com.yammer.metrics.core.HealthCheck.Result

/**
 * Created by saumil on 2014/04/25.
 */
class TemplateHealthCheck(resourceName: String) extends HealthCheck(resourceName) {

  def check() = {
    Result.healthy("Everything is hunky dory")
  }
}
