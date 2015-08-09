package com.github.tanacasino.time4s.wrappers.objects


import java.time._
import java.time.temporal.TemporalAccessor
import java.time.format.DateTimeFormatter


object StaticInstant extends StaticInstant


trait StaticInstant {

  def from(temporal: TemporalAccessor): Instant = Instant.from(temporal)

  def now: Instant = Instant.now

  def now(clock: Clock): Instant = Instant.now(clock)

  def ofEpochMilli(epochMilli: Long): Instant = Instant.ofEpochMilli(epochMilli)

  def ofEpochSecond(epochSecond: Long): Instant = Instant.ofEpochSecond(epochSecond)

  def ofEpochSecond(epochSecond: Long, nanoAdjustment: Long): Instant = Instant.ofEpochSecond(epochSecond, nanoAdjustment)

  def parse(text: CharSequence): Instant = Instant.parse(text)

}

