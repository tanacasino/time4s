package com.github.tanacasino.time4s.wrappers


import java.time.LocalDateTime

import com.github.tanacasino.time4s.core.PimpedType


// NOTE: AnyVal がいいのか？AnyRefがいいのか？差を調べる
class RichLocalDateTime(val value: LocalDateTime) extends AnyVal with PimpedType[LocalDateTime] {

  def +(days: Long): LocalDateTime = {
    value.plusDays(days)
  }

  def -(days: Long): LocalDateTime = {
    value.minusDays(days)
  }

}
