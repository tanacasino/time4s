package com.github.tanacasino.time4s.wrappers


import java.time.Duration
import java.time.temporal.TemporalUnit

import scala.collection.JavaConverters._

import com.github.tanacasino.time4s.core.PimpedType


class RichDuration(val value: Duration) extends AnyVal with PimpedType[Duration] {

  def nano: Int = value.getNano

  def seconds: Long = value.getSeconds

  def days: Long = value.toDays

  def hours: Long = value.toHours

  def millis: Long = value.toMillis

  def minutes: Long = value.toMinutes

  def nanos: Long = value.toNanos

  def units: Seq[TemporalUnit] = value.getUnits.asScala.toSeq

  def unary_- : Duration = value.negated

  def -(duration: Duration): Duration = value.minus(duration)

  def +(duration: Duration): Duration = value.plus(duration)

  def *(scalar: Long): Duration = value.multipliedBy(scalar)

}

