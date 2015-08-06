package com.github.tanacasino.time4s.wrappers


import java.time.OffsetDateTime
import java.time.temporal._

import com.github.tanacasino.time4s.core.PimpedType


class RichOffsetDateTime(val value: OffsetDateTime) extends AnyVal with PimpedType[OffsetDateTime] {

  def +(days: Long): OffsetDateTime = value.plusDays(days)

  def +(amountToAdd: TemporalAmount): OffsetDateTime = value.plus(amountToAdd)

  def +(amountToAdd: Long, unit: TemporalUnit): OffsetDateTime = value.plus(amountToAdd, unit)

  def -(days: Long): OffsetDateTime = value.minusDays(days)

  def -(amountToMinus: TemporalAmount): OffsetDateTime = value.minus(amountToMinus)

  def -(amountToMinus: Long, unit: TemporalUnit): OffsetDateTime = value.minus(amountToMinus, unit)

}
