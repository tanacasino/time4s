package com.github.tanacasino.time4s.wrappers


import java.time.Period

import com.github.tanacasino.time4s.core.PimpedType


class RichInt(val value: Int) extends AnyVal with PimpedType[Int] {

  def day = Period.ofDays(value)

  def days = day

  def year = Period.ofYears(value)

  def years = year

}
