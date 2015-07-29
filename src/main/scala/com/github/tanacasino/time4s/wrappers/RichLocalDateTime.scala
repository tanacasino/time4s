package com.github.tanacasino.time4s.wrappers


import java.time.LocalDateTime
import java.time.temporal._

import com.github.tanacasino.time4s.core.PimpedType


// NOTE: AnyVal がいいのか？AnyRefがいいのか？差を調べる
class RichLocalDateTime(val value: LocalDateTime) extends AnyVal with PimpedType[LocalDateTime] {

  def +(days: Long) = value.plusDays(days)

  def +(amountToAdd: TemporalAmount) = value.plus(amountToAdd)

  def +(amountToAdd: Long, unit: TemporalUnit) = value.plus(amountToAdd, unit)

  def -(days: Long) = value.minusDays(days)

  def -(amountToMinus: TemporalAmount) = value.minus(amountToMinus)

  def -(amountToMinus: Long, unit: TemporalUnit) = value.minus(amountToMinus, unit)

}

