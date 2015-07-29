package com.github.tanacasino.time4s.wrappers.objects


import java.time.LocalDateTime

object StaticLocalDateTime extends StaticLocalDateTime


trait StaticLocalDateTime {


  def now = LocalDateTime.now


  def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int) =
      LocalDateTime.of(year, month, dayOfMonth, hour, minute)


  def of(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int) =
      LocalDateTime.of(year, month, dayOfMonth, hour, minute, second)

}

