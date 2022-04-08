package com.example.shoppingmall.common

import lombok.Data
import java.util.*
import kotlin.collections.HashMap

@Data
class AjaxJson {

    var success: Boolean = true

    var msg: String = "操作成功"

    var obj: Objects? = null;

    var attributes: Map<String,Objects>? = null;

}