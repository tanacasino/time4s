package com.github.tanacasino.time4s.wrappers


import java.time.ZonedDateTime

import com.github.tanacasino.time4s.core.PimpedType


class RichZonedDateTime(val value: ZonedDateTime) extends AnyVal with PimpedType[ZonedDateTime] {

  def +(days: Long) = value.plusDays(days)

  def -(days: Long) = value.minusDays(days)

}
