package com.noji.kotlinjpatest.service

import com.noji.kotlinjpatest.entity.Goods
import com.noji.kotlinjpatest.repository.GoodsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class GoodsService(val goodsRepository: GoodsRepository) {

    fun goodsSearchAll(): List<Goods>{
        return goodsRepository.findAll()
    }
}