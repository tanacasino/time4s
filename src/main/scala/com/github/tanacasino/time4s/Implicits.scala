package com.github.tanacasino.time4s


import java.time.LocalDateTime

import com.github.tanacasino.time4s.rich._


trait Implicits extends DateTimeImplicits


trait DateTimeImplicits {

  implicit def richLocalDateTime(ldt: LocalDateTime): RichLocalDateTime = new RichLocalDateTime(ldt)

}

