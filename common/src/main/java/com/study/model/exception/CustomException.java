package com.study.model.exception;

import com.study.model.web.response.ResultCode;

/**
 * @author chenhaotao
 * @Description: 自定义业务异常
 * @date: 2019-01-14 23:32
 * @vsrsion: v1.0
 */
public class CustomException extends RuntimeException{

    //使用自定义的返回格式作为错误代码
    ResultCode resultCode;

    //构造方法,规定每次抛出异常都必须传入错误代码
    public CustomException(ResultCode resultCode){
        super("错误代码："+ resultCode.code() + "错误信息:" + resultCode.message());
        this.resultCode = resultCode;
    }

    public void setResultCode(ResultCode resultCode){
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode(){
        return resultCode;
    }

}
