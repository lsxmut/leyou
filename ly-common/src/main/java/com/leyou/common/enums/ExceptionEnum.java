package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ExceptionEnum {

    PRICE_COULDNOT_BE_BULL(400,"价格不能为空！"),
    CATEGORY_NOT_FOND(404,"商品分类不存在！")
    ;
    private int code;
    private String msg;
}
