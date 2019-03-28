package com.study.model.web.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chenhaotao
 * @Description: 接口返回实体类
 * @date: 2019-01-05 11:54
 * @vsrsion: v1.0
 */
@Data
@ToString
@NoArgsConstructor
@ApiModel(value = "返回说明")
public class ResponseResult implements Response {

    //操作是否成功
    @ApiModelProperty(value = "成功标识；true：成功；false:失败")
    boolean flag = true;

    //操作代码
    @ApiModelProperty(value = "返回状态码；10000:成功")
    int code = SUCCESS_CODE;

    //提示信息
    @ApiModelProperty(value = "描述信息")
    String message = MSG_SUCCESS;

    /**
     * @Description: 使用枚举返回类型构建返回结果
     * @Param [resultCode]
     * @return
     * @Author chenhaotao
     * @Date 2019/1/5 0005 11:58
     */
    public ResponseResult(ResultCode resultCode){
        this.flag = resultCode.flag();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    /**
     * @Description: 返回成功状态
     * @Param []
     * @return com.chen.model.web.ResultRespons
     * @Author chenhaotao
     * @Date 2019/1/5 0005 12:03
     */
    public static ResponseResult returnSuccess(){
        return new ResponseResult(CommonCode.SUCCESS);
    }

    /**
     * @Description: 返回失败状态
     * @Param []
     * @return com.chen.model.web.ResultRespons
     * @Author chenhaotao
     * @Date 2019/1/5 0005 12:03
     */
    public static ResponseResult returnFail(){
        return new ResponseResult(CommonCode.FAIL);
    }

}
