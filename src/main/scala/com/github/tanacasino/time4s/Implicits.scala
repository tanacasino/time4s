package com.github.tanacasino.time4s


import java.time._

import com.github.tanacasino.time4s.wrappers._


trait Implicits extends DateTimeImplicits with TemporalImplicits with IntImplicits


trait IntImplicits {

  implicit def toRichInt(value: Int): RichInt = new RichInt(value)

  implicit def toRichLong(value: Long): RichLong = new RichLong(value)

}


trait DateTimeImplicits {

  implicit def richLocalDateTime(ldt: LocalDateTime): RichLocalDateTime = new RichLocalDateTime(ldt)

  implicit def richOffsetDateTime(ldt: OffsetDateTime): RichOffsetDateTime = new RichOffsetDateTime(ldt)

  implicit def richZonedDateTime(ldt: ZonedDateTime): RichZonedDateTime = new RichZonedDateTime(ldt)

}


trait TemporalImplicits {
  implicit def richPeriod(period: Period): RichPeriod = new RichPeriod(period)
}
