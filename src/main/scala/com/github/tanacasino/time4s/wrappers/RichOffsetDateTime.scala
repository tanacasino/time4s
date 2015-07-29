package com.github.tanacasino.time4s.wrappers


import java.time.OffsetDateTime

import com.github.tanacasino.time4s.core.PimpedType


// NOTE: AnyVal がいいのか？AnyRefがいいのか？差を調べる
class RichOffsetDateTime(val value: OffsetDateTime) extends AnyVal with PimpedType[OffsetDateTime] {

  def +(days: Long) = value.plusDays(days)

  def -(days: Long) = value.minusDays(days)

}
