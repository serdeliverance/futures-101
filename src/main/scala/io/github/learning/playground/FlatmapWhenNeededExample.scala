package io.github.learning.playground

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object FlatmapWhenNeededExample {

  getAllPayments()
    .map(payments => payments.sum)

  def getAllPayments(): Future[List[BigDecimal]] = ???
}
