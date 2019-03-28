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
public class QueryListResult<T> extends ResponseResult {

    ListResult<T> listResult;

    /**
     * @param resultCodeEnum
     * @return
     * @Description: 使用枚举返回类型构建返回list结果
     * @Param [resultCode]
     * @Author chenhaotao
     * @Date 2019/1/5 0005 11:58
     */
    public QueryListResult(CommonCode resultCodeEnum, ListResult listResult) {
        super(resultCodeEnum);
        this.listResult = listResult;
    }

    /**
     * 返回成功结果
     * @param listResult
     * @return
     */
    public static QueryListResult returnSuccess(ListResult listResult){
        return new QueryListResult<>(CommonCode.SUCCESS, listResult);
    }
}

