package com.github.tanacasino.time4s.wrappers


import java.time.{Duration, Period}

import com.github.tanacasino.time4s.core.PimpedType


class RichInt(val value: Int) extends AnyVal with PimpedType[Int] {

  def day = Period.ofDays(value)

  def days = day

  def year = Period.ofYears(value)

  def years = year

  def month = Period.ofMonths(value)

  def months = month

  def hour = Duration.ofHours(value.toLong)

  def hours = hour

  def minute = Duration.ofMinutes(value.toLong)

  def minutes = minute

  def second = Duration.ofSeconds(value.toLong)

  def seconds = second

  def milli = Duration.ofMillis(value.toLong)

  def millis = milli

  def nano = Duration.ofNanos(value.toLong)

  def nanos = nano

}
