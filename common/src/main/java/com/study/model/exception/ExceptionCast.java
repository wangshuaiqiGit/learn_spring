package com.study.model.exception;

import com.study.model.exception.CustomException;
import com.study.model.web.response.ResultCode;

/**
 * @autho
 * @Description: 异常抛出类,通过调用该类方法可以实现抛出异常类
 * @date: 2019-01-14 23:58
 * @vsrsion: v1.0
 */
public class ExceptionCast {

    public static void cast(ResultCode resultCode){
        throw new CustomException(resultCode);
    }
}
