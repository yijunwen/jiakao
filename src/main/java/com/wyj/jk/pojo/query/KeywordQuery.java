package com.wyj.jk.pojo.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: wen.yijun
 * @Description:
 * @Date: 2020/12/9
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class KeywordQuery<T> extends PageQuery<T>{
    private String keyword;
}
