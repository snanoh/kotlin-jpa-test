package com.noji.kotlinjpatest.repository

import com.noji.kotlinjpatest.entity.Goods
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GoodsRepository: JpaRepository<Goods, Long>{
}