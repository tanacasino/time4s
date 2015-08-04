package com.github.tanacasino.time4s.wrappers.objects


import java.time._
import java.time.temporal.TemporalAccessor
import java.time.format.DateTimeFormatter


object StaticZonedDateTime extends StaticZonedDateTime


trait StaticZonedDateTime {

  def from(temporal: TemporalAccessor) = OffsetDateTime.from(temporal)

  def now: ZonedDateTime = ZonedDateTime.now

  def now(zone: ZoneId) = ZonedDateTime.now(zone)

  def now(clock: Clock) = ZonedDateTime.now(clock)

  def of(year: Int,
         month: Int,
         dayOfMonth: Int,
         hour: Int,
         minute: Int,
         second: Int,
         nanoOfSecond: Int,
         zone: ZoneId) =
    ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, zone)

  def of(date: LocalDate, time: LocalTime, offset: ZoneOffset) =
    OffsetDateTime.of(date, time, offset)

  def of(dateTime: LocalDateTime, offset: ZoneOffset) = OffsetDateTime.of(dateTime, offset)

  def ofInstant(instant: Instant, zone: ZoneId) = OffsetDateTime.ofInstant(instant, zone)

  def ofInstant(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId) =
    ZonedDateTime.ofInstant(localDateTime, offset, zone)

  def ofLocal(localDateTime: LocalDateTime, zone: ZoneId, preferredOffset: ZoneOffset) =
    ZonedDateTime.ofLocal(localDateTime, zone, preferredOffset)

  def ofStrict(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId) =
    ZonedDateTime.ofStrict(localDateTime, offset, zone)

  def parse(text: CharSequence) = ZonedDateTime.parse(text)

  def parse(text: CharSequence, formatter: DateTimeFormatter) =
    ZonedDateTime.parse(text, formatter)

}
