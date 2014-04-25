package scala.service.core

import scala.reflect.BeanProperty

/**
 * Created by saumil on 2014/04/24.
 */
class Welcome(@BeanProperty val id: Long, @BeanProperty val content: String) {

}
