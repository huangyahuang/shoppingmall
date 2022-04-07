package com.example.shoppingmall.entity

import lombok.Data
import org.hibernate.annotations.Table
import javax.persistence.*

/*
* 商品管理
* */
@Entity(name="commodity_manage")
@Table(appliesTo ="commodity_manage")
@Data
class CommodityManageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id : Int  = 0;


}