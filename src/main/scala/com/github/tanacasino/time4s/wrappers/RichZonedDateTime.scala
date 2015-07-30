package com.github.tanacasino.time4s.wrappers


import java.time.ZonedDateTime
import java.time.temporal._

import com.github.tanacasino.time4s.core.PimpedType


class RichZonedDateTime(val value: ZonedDateTime) extends AnyVal with PimpedType[ZonedDateTime] {

  def +(days: Long) = value.plusDays(days)

  def +(amountToAdd: TemporalAmount) = value.plus(amountToAdd)

  def +(amountToAdd: Long, unit: TemporalUnit) = value.plus(amountToAdd, unit)

  def -(days: Long) = value.minusDays(days)

  def -(amountToMinus: TemporalAmount) = value.minus(amountToMinus)

  def -(amountToMinus: Long, unit: TemporalUnit) = value.minus(amountToMinus, unit)

}
