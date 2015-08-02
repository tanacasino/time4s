package com.github.tanacasino.time4s.wrappers


import java.time.OffsetDateTime
import java.time.temporal._

import com.github.tanacasino.time4s.core.PimpedType


class RichOffsetDateTime(val value: OffsetDateTime) extends AnyVal with PimpedType[OffsetDateTime] {

  def +(days: Long) = value.plusDays(days)

  def +(amountToAdd: TemporalAmount) = value.plus(amountToAdd)

  def +(amountToAdd: Long, unit: TemporalUnit) = value.plus(amountToAdd, unit)

  def -(days: Long) = value.minusDays(days)

  def -(amountToMinus: TemporalAmount) = value.minus(amountToMinus)

  def -(amountToMinus: Long, unit: TemporalUnit) = value.minus(amountToMinus, unit)

}
