package com.noji.kotlinjpatest.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Goods (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var goodsCd: Long,
    var goodsNm: String,
    val price: Int
        ){

}