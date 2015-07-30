package com.github.tanacasino.time4s.wrappers.objects


import java.time._
import java.time.temporal.TemporalAccessor
import java.time.format.DateTimeFormatter


object StaticZonedDateTime extends StaticZonedDateTime


trait StaticZonedDateTime {

  def now: ZonedDateTime = ZonedDateTime.now

  def now(zone: ZoneId) = ZonedDateTime.now(zone)

  def now(clock: Clock) = ZonedDateTime.now(clock)

}
