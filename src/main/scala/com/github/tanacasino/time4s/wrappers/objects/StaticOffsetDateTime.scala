package com.github.tanacasino.time4s.wrappers.objects


import java.time._
import java.time.temporal.TemporalAccessor
import java.time.format.DateTimeFormatter


object StaticOffsetDateTime extends StaticOffsetDateTime


trait StaticOffsetDateTime {

  def now: OffsetDateTime = OffsetDateTime.now

  def now(zone: ZoneId) = OffsetDateTime.now(zone)

  def now(clock: Clock) = OffsetDateTime.now(clock)

}
