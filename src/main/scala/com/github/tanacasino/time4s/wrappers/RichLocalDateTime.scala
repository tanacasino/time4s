package com.github.tanacasino.time4s.wrappers


import java.time.LocalDateTime
import java.time.temporal._

import com.github.tanacasino.time4s.core.PimpedType


class RichLocalDateTime(val value: LocalDateTime) extends AnyVal with PimpedType[LocalDateTime] {

  def +(days: Long) = value.plusDays(days)

  def +(amountToAdd: TemporalAmount) = value.plus(amountToAdd)

  def +(amountToAdd: Long, unit: TemporalUnit) = value.plus(amountToAdd, unit)

  def -(days: Long) = value.minusDays(days)

  def -(amountToMinus: TemporalAmount) = value.minus(amountToMinus)

  def -(amountToMinus: Long, unit: TemporalUnit) = value.minus(amountToMinus, unit)

  def tommorow = value.plusDays(1)

  def nextDay = value.plusDays(1)

  def nextMonth = value.plusMonths(1)

  def nextYear = value.plusYears(1)

  def yesterday = value.minusDays(1)

  def lastDay = value.minusDays(1)

  def lastMonth = value.minusMonths(1)

  def lastYear = value.minusYears(1)

}

