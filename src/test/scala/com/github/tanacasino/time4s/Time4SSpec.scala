package com.github.tanacasino.time4s


import org.scalatest._

import com.github.tanacasino.time4s


class Time4SSpec extends WordSpec {

  "A time4s" should {

    "works well with only imports" in {
      import com.github.tanacasino.time4s.Imports._

      val now = LocalDateTime.now
      assert(now.isInstanceOf[java.time.LocalDateTime])

      val birthday = LocalDateTime.of(2011, 8, 19, 2, 59)
      println(birthday)
      assert(birthday.getYear == 2011)
      assert(birthday.getMonth == java.time.Month.AUGUST)
      assert(birthday.getDayOfMonth == 19)

      val yesterday = birthday - 1
      assert(yesterday.getYear == 2011)
      assert(yesterday.getMonth == java.time.Month.AUGUST)
      assert(yesterday.getDayOfMonth == 18)

      val yesterday2 = birthday - 1.days
      assert(yesterday == yesterday2)

      val zonedDateTime = ZonedDateTime.now
      val x = zonedDateTime + 1
      assert(x != zonedDateTime)
      val y = zonedDateTime - 1
      assert(y != zonedDateTime)
      assert(x - 1 == zonedDateTime)
      assert(y + 1 == zonedDateTime)
    }

  }

}

