package com.noji.kotlinjpatest.controller

import com.noji.kotlinjpatest.entity.Goods
import com.noji.kotlinjpatest.service.GoodsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class GoodsApiController(val goodsService: GoodsService) {

    @GetMapping("")
    fun goodsSearchAll(): List<Goods> {
        return goodsService.goodsSearchAll()
    }
}