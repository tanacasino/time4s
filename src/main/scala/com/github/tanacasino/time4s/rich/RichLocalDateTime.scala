package com.github.tanacasino.time4s.rich


import java.time.LocalDateTime

import com.github.tanacasino.time4s.core.PimpedType


class RichLocalDateTime(val value: LocalDateTime) extends AnyVal with PimpedType[LocalDateTime] {

  def +(days: Long): LocalDateTime = {
    value.plusDays(days)
  }

  def -(days: Long): LocalDateTime = {
    value.minusDays(days)
  }

}
