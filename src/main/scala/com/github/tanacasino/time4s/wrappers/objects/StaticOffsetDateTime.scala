package com.github.tanacasino.time4s.wrappers.objects


import java.time._
import java.time.temporal.TemporalAccessor
import java.time.format.DateTimeFormatter


object StaticOffsetDateTime extends StaticOffsetDateTime


trait StaticOffsetDateTime {

  def from(temporal: TemporalAccessor) = OffsetDateTime.from(temporal)

  def now: OffsetDateTime = OffsetDateTime.now

  def now(zone: ZoneId) = OffsetDateTime.now(zone)

  def now(clock: Clock) = OffsetDateTime.now(clock)

  def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int, offset: ZoneOffset) =
    OffsetDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, offset)

  def of(date: LocalDate, time: LocalTime, offset: ZoneOffset) = OffsetDateTime.of(date, time, offset)

  def of(dateTime: LocalDateTime, offset: ZoneOffset) = OffsetDateTime.of(dateTime, offset)

  def ofInstant(instant: Instant, zone: ZoneId) = OffsetDateTime.ofInstant(instant, zone)

  def parse(text: CharSequence) = OffsetDateTime.parse(text)

  def parse(text: CharSequence, formatter: DateTimeFormatter) = OffsetDateTime.parse(text, formatter)

  def timeLineOrder(): java.util.Comparator[OffsetDateTime] = OffsetDateTime.timeLineOrder()

}
