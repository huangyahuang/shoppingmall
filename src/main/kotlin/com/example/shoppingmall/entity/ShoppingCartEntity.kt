package com.example.shoppingmall.entity

import lombok.Data
import org.hibernate.annotations.Table
import java.util.*
import javax.persistence.*

/*
* 购物车
* */
@Entity(name="shopping_cart")
@Table(appliesTo ="shopping_cart")
@Data
class ShoppingCartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Int = 1

    @Column(name = "commodity_id")
    var commodityId : Int = 0;

    @Column(name = "user_id")
    var userId : Int = 0

    @Column(name = "add_time")
    var addTime : Date? = null
}