package com.study.model.web.response;

import lombok.ToString;

/**
 * @author chenhaotao
 * @Description: 接口返回结果枚举类
 * @Title: CommonCode
 * @ProjectName sc-multipl-project
 * @date 2019-01-05 11:38
 */
@ToString
public enum CommonCode implements ResultCode {

    SUCCESS(true, 10000, "操作成功！"),
    UNAUTHENTICATED(false, 10001, "此操作需要登陆系统！"),
    UNAUTHORISE(false, 10002, "权限不足，无权操作！"),
    INVALID_PARAM(false, 10003, "非法参数！"),
    FAIL(false, 11111, "操作失败！"),
    SERVER_ERROR(false, 99999, "抱歉，系统繁忙，请稍后重试！");

    //操作是否成功
    boolean flag;
    //操作代码
    int code;
    //提示信息
    String message;

    private CommonCode(boolean flag, int code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

        public boolean flag() {
        return flag;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
}
