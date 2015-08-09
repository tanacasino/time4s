package com.github.tanacasino.time4s.wrappers


import java.time.ZonedDateTime
import java.time.temporal._

import com.github.tanacasino.time4s.core.PimpedType


class RichZonedDateTime(val value: ZonedDateTime) extends AnyVal with PimpedType[ZonedDateTime] {

  def +(days: Long): ZonedDateTime = value.plusDays(days)

  def +(amountToAdd: TemporalAmount): ZonedDateTime = value.plus(amountToAdd)

  def +(amountToAdd: Long, unit: TemporalUnit): ZonedDateTime = value.plus(amountToAdd, unit)

  def -(days: Long): ZonedDateTime = value.minusDays(days)

  def -(amountToMinus: TemporalAmount): ZonedDateTime = value.minus(amountToMinus)

  def -(amountToMinus: Long, unit: TemporalUnit): ZonedDateTime = value.minus(amountToMinus, unit)
}
