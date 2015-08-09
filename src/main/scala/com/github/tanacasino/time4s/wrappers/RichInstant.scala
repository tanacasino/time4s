package com.github.tanacasino.time4s.wrappers


import java.time.Instant

import java.time.temporal.TemporalAmount

import com.github.tanacasino.time4s.core.PimpedType


class RichInstant(val value: Instant) extends AnyVal with PimpedType[Instant] {

  def +(amountToAdd: TemporalAmount): Instant = value.plus(amountToAdd)

  def -(amountToMinus: TemporalAmount): Instant = value.minus(amountToMinus)

}

