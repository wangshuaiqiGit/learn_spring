package com.study.model.exception;

import com.chen.model.web.response.CommonCode;
import com.chen.model.web.response.ResponseResult;
import com.chen.model.web.response.ResultCode;
import com.google.common.collect.ImmutableMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 统一异常捕获类
 * 使用 @ControllerAdvice和@ExceptionHandler注解来捕获指定类型的异常
 * @author chenhaotao
 * @date: 2019-01-14 23:37
 * @vsrsion: v1.0
 */
//控制器增强,实现对项目异常捕获
@ControllerAdvice
public class ExceptionCatch {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionCatch.class);

    //定义map，配置异常类型所对应的错误代码
    private static ImmutableMap<Class<? extends Throwable>, ResultCode> EXCEPTIONS;
    //定义map的builder对象，去构建ImmutableMap
    protected static ImmutableMap.Builder<Class<? extends Throwable>,ResultCode> builder = ImmutableMap.builder();

    //捕获自定义异常如CustomException此类异常
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public ResponseResult customException(CustomException exception){
        //记录日志
        LOGGER.error("catch exception:{} {}\r\nexception: ",exception.getMessage(),exception);
        ResultCode resultCode = exception.getResultCode();
        //返回接口结果数据
        return new ResponseResult(resultCode);
    }
    //捕获未知异常如Exception此类异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseResult exception(Exception exception){
        //记录日志
        LOGGER.error("catch exception:{}",exception.getMessage());
        if(EXCEPTIONS == null){
            EXCEPTIONS = builder.build();//EXCEPTIONS构建成功
        }
        //从EXCEPTIONS中找异常类型所对应的错误代码，如果找到了将错误代码响应给用户，如果找不到给用户响应99999异常
        ResultCode resultCode = EXCEPTIONS.get(exception.getClass());
        if(resultCode !=null){
            return new ResponseResult(resultCode);
        }else{
            //返回99999异常
            return new ResponseResult(CommonCode.SERVER_ERROR);
        }


    }

    static {
        //定义可预知的系统异常类型所对应的项目自定义错误代码
        //如HttpMessageNotReadableException通常是因为参数问题,对应自定义错误代码 CommonCode.INVALID_PARAM
        builder.put(HttpMessageNotReadableException.class,CommonCode.INVALID_PARAM);
    }
}
