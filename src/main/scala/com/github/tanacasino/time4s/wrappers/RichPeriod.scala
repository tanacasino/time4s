package com.github.tanacasino.time4s.wrappers


import java.time.Period

import com.github.tanacasino.time4s.core.PimpedType


class RichPeriod(val value: Period) extends AnyVal with PimpedType[Period] {

  def days: Int = value.getDays

  def months: Int = value.getMonths

  def years: Int = value.getYears

  def unary_- : Period = value.negated

  def -(period: Period): Period = value.minus(period)

  def +(period: Period): Period = value.plus(period)

  def *(scalar: Int): Period = value.multipliedBy(scalar)

}

