package com.chen.model.web.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author chenhaotao
 * @Description: 查询列表数据结构封装
 * @date: 2019-01-05 12:08
 * @vsrsion: v1.0
 */
@Getter
@Setter
@ToString
public class ListResult<T> {

    //数据列表
    private List<T> list;

    //数据总数
    private long total;

}
