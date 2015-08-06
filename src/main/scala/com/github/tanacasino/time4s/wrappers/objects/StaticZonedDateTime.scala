package com.github.tanacasino.time4s.wrappers.objects


import java.time._
import java.time.temporal.TemporalAccessor
import java.time.format.DateTimeFormatter


object StaticZonedDateTime extends StaticZonedDateTime


trait StaticZonedDateTime {

  def from(temporal: TemporalAccessor): ZonedDateTime = ZonedDateTime.from(temporal)

  def now: ZonedDateTime = ZonedDateTime.now

  def now(zone: ZoneId): ZonedDateTime = ZonedDateTime.now(zone)

  def now(clock: Clock): ZonedDateTime = ZonedDateTime.now(clock)

  def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int, zone: ZoneId): ZonedDateTime =
    ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, zone)

  def of(date: LocalDate, time: LocalTime, offset: ZoneOffset): ZonedDateTime =
    ZonedDateTime.of(date, time, offset)

  def of(dateTime: LocalDateTime, offset: ZoneOffset): ZonedDateTime = ZonedDateTime.of(dateTime, offset)

  def ofInstant(instant: Instant, zone: ZoneId): ZonedDateTime = ZonedDateTime.ofInstant(instant, zone)

  def ofInstant(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime =
    ZonedDateTime.ofInstant(localDateTime, offset, zone)

  def ofLocal(localDateTime: LocalDateTime, zone: ZoneId, preferredOffset: ZoneOffset): ZonedDateTime =
    ZonedDateTime.ofLocal(localDateTime, zone, preferredOffset)

  def ofStrict(localDateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId): ZonedDateTime =
    ZonedDateTime.ofStrict(localDateTime, offset, zone)

  def parse(text: CharSequence): ZonedDateTime = ZonedDateTime.parse(text)

  def parse(text: CharSequence, formatter: DateTimeFormatter): ZonedDateTime =
    ZonedDateTime.parse(text, formatter)

}
