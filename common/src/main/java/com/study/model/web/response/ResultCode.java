package com.study.model.web.response;

/**
 * @author chenhaotao
 * @Description: 定义接口返回的数据结构
 * @date: 2019-01-05 11:21
 * @vsrsion: v1.0
 */
public interface ResultCode {

    /**
     * @Description: 接口操作成功标识, success成功,fail失败
     * @Param
     * @return
     * @Author chenhaotao
     * @Date 2019/1/5 0005 11:24
     */
    boolean flag();

    /**
     * @Description: 操作代码
     * @Param []
     * @return int
     * @Author chenhaotao
     * @Date 2019/1/5 0005 11:26
     */
    int code();
    
    /**
     * @Description: 提示信息
     * @Param []
     * @return java.lang.String
     * @Author chenhaotao 
     * @Date 2019/1/5 0005 11:27  
     */
    String message();

}
