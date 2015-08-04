package com.github.tanacasino.time4s.wrappers.objects


import java.time._
import java.time.temporal.TemporalAccessor
import java.time.format.DateTimeFormatter


object StaticLocalDateTime extends StaticLocalDateTime


trait StaticLocalDateTime {

  def from(temporal: TemporalAccessor) = LocalDateTime.from(temporal)

  def now: LocalDateTime = LocalDateTime.now

  def now(zone: ZoneId) = LocalDateTime.now(zone)

  def now(clock: Clock) = LocalDateTime.now(clock)

  def of(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int) =
    LocalDateTime.of(year, month, dayOfMonth, hour, minute)

  def of(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int, second: Int) =
    LocalDateTime.of(year, month, dayOfMonth, hour, minute, second)

  def of(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int) =
      LocalDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond)

  def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int) =
      LocalDateTime.of(year, month, dayOfMonth, hour, minute)

  def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int) =
      LocalDateTime.of(year, month, dayOfMonth, hour, minute, second)

  def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int) =
      LocalDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond)

  def of(date: LocalDate, time: LocalTime) = LocalDateTime.of(date, time)

  def ofInstant(instant: Instant, zone: ZoneId) = LocalDateTime.ofInstant(instant, zone)

  def ofEpochSecond(epochSecond: Long, nanoOfSecond: Int, offset: ZoneOffset) =
    LocalDateTime.ofEpochSecond(epochSecond, nanoOfSecond, offset)

  def parse(text: CharSequence) = LocalDateTime.parse(text)

  def parse(text: CharSequence, formatter: DateTimeFormatter) = LocalDateTime.parse(text, formatter)

}

