package com.github.tanacasino.time4s


import java.time._

import com.github.tanacasino.time4s.wrappers._


trait Implicits extends DateTimeImplicits with IntImplicits


trait IntImplicits {

  implicit def toRichInt(value: Int): RichInt = new RichInt(value)

}

trait DateTimeImplicits {

  implicit def richLocalDateTime(ldt: LocalDateTime): RichLocalDateTime = new RichLocalDateTime(ldt)

  implicit def richZonedDateTime(ldt: ZonedDateTime): RichZonedDateTime = new RichZonedDateTime(ldt)

}

