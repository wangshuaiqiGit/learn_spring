package com.study.model.web.response;
/**
 * @Description: 接口返回数据基础类,定义了接口返回的最基本数据
 * @author chenhaotao
 * @Title: ResultResponsBase
 * @ProjectName sc-multipl-project
 * @date 2019-01-05 11:50
 */
public interface Response {

    public static final boolean SUCCESS = ResultCodeConstant.SUCCESS;
    public static final int SUCCESS_CODE = ResultCodeConstant.SUCCESS_CODE;
    public static final String MSG_SUCCESS = ResultCodeConstant.MSG_SUCCESS;

}
