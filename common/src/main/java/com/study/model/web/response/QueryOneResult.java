package com.study.model.web.response;

import lombok.Data;
import lombok.ToString;

/**
 * @author chenhaotao
 * @Description: 接口返回最终返回封装
 * @date: 2019-01-05 12:10
 * @vsrsion: v1.0
 */

@Data
@ToString
public class QueryOneResult<T> extends ResponseResult {

    OneResult<T> oneResult;


    /**
     * @param resultCodeEnum
     * @return
     * @Description: 使用枚举返回类型构建返回单个查询结果
     * @Param [resultCode]
     * @Author chenhaotao
     * @Date 2019/1/5 0005 11:58
     */
    public QueryOneResult(CommonCode resultCodeEnum, OneResult oneResult) {
        super(resultCodeEnum);
        this.oneResult = oneResult;
    }

    /**
     * 返回成功结果
     * @param oneResult
     * @return
     */
    public static QueryOneResult returnSuccess(OneResult oneResult) {
        return new QueryOneResult<>(CommonCode.SUCCESS, oneResult);
    }

}

