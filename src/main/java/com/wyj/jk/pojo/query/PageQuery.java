package com.wyj.jk.pojo.query;

import lombok.Data;

import java.util.List;

/**
 * @Author: wen.yijun
 * @Description:
 * @Date: 2020/12/9
 **/

@Data
public class PageQuery<T> {
    private static final int DEFAULT_SIZE = 10;
    private static final int DEFAULT_PAGE = 1;

    private long page;
    private long size;
    private long pages;
    private long count;
    private List<T> data;

    public long getPage() {
        return Math.max(DEFAULT_PAGE, page);
    }

    public long getSize() {
        return (size > 0) ? size : DEFAULT_SIZE;
    }
}
