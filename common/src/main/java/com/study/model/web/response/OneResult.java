package com.study.model.web.response;

import lombok.Data;

/**
 * @author chenhaotao
 * @Description: 查询单个数据返回结果封装
 * @date: 2019-01-19 12:43
 * @vsrsion: v1.0
 */
@Data
public class OneResult<T> {

    private T result;
}
