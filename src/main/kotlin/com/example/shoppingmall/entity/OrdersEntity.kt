package com.example.shoppingmall.entity

import lombok.Data
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Table
import java.util.*
import javax.persistence.*

/*
* 订单管理
* */
@Entity(name="orders")
@Table(appliesTo ="orders")
@Data
class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Int = 1

    @Column(name = "orders_number")
    var ordersNumber :String = ""

    @Column(name = "commodity_id")
    var commodityId : Int = 0;

    @Column(name = "user_id")
    var userId : Int = 0

    @Column(name = "orders_time")
    var ordersTime : Date? = null

}