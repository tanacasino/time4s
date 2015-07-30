package com.github.tanacasino.time4s


object Imports extends Imports


trait Imports extends TypeImports with StaticTypeImports with Implicits


object TypeImports extends TypeImports


trait TypeImports {

  type LocalDateTime = java.time.LocalDateTime

}


object StaticTypeImports extends StaticTypeImports


trait StaticTypeImports {

  val LocalDateTime = com.github.tanacasino.time4s.wrappers.objects.StaticLocalDateTime

  val ZonedDateTime = com.github.tanacasino.time4s.wrappers.objects.StaticZonedDateTime

}

