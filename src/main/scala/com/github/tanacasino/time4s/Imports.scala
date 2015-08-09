package com.github.tanacasino.time4s


object Imports extends Imports


trait Imports extends TypeImports with StaticTypeImports with Implicits


object TypeImports extends TypeImports


trait TypeImports {

  type LocalDateTime = java.time.LocalDateTime

  type OffsetDateTime = java.time.OffsetDateTime

  type ZonedDateTime = java.time.ZonedDateTime

}


object StaticTypeImports extends StaticTypeImports


trait StaticTypeImports {

  val LocalDateTime = com.github.tanacasino.time4s.wrappers.objects.StaticLocalDateTime

  val OffsetDateTime = com.github.tanacasino.time4s.wrappers.objects.StaticOffsetDateTime

  val ZonedDateTime = com.github.tanacasino.time4s.wrappers.objects.StaticZonedDateTime

  val Instant = com.github.tanacasino.time4s.wrappers.objects.StaticInstant

}

