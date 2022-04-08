package com.example.shoppingmall.entity

import lombok.Data
import org.hibernate.annotations.Table
import javax.persistence.*

/*
* 商品管理
* */
@Entity(name="goods_manage")
@Table(appliesTo ="goods_manage")
@Data
class GoodsManageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable=false)
    var id : Int  = 0

    @Column(name = "goods_name",nullable=false)
    var goodsName: String = ""

    @Column(name = "goods_type",nullable=false)
    var goodsType: String = ""

    @Column(name = "goods_specs",nullable=false, length = 2000)
    var goodsSpecs: String = ""

    @Column(name = "goods_price",nullable=false)
    var goodsPrice: Int = 1

    @Column(name = "goods_details",length=4000)
    var goodsDetails: String = "";

}