package com.haihong.charge.connectivity.util;

public class Constants {

    public static final int USER_NOT_REGISTERED_CODE = 0;
    public static final int RESULT_RETURN_SUCCESS_CODE = 1;
    public static final int RESULT_RETURN_EXCEPTION_CODE = 2;
    public static final int RESULT_RETURN_ERROR_CODE = 3;
    public static final int RESULT_RETURN_NO_LOGIN_CODE = 4;


    public static final String USER_REGISTERED_MES = "用户已注册";
    public static final String USER_NOT_REGISTERED_MES = "用户未注册";

    public static final String RESULT_RETURN_SUCCESS_MSG = "请求成功";
    public static final String SYSTEM_ERROR_MSG = "系统错误，请联系管理员";

    /**
     * 操作成功代码
     **/
    public static final int IResult_Success_Code = 0;

    /**
     * 错误代码
     **/
    public static final int IResult_Error_Code = -1;

    /**
     * 操作失败代码
     **/
    public static final int IResult_Failed_Code = -2;

    /**
     * 系统错误代码
     **/
    public static final int IResult_SysError_Code = -9999;

    /**
     * 用户未登录代码
     **/
    public static final int IResult_UserNoLogin_Code = -1000;

    /**
     * 无权限错误代码
     **/
    public static final int IResult_NoPower_Code = -1003;

    /**
     * 文件上传失败错误代码
     **/
    public static final int IResult_UploadError_Code = -1100;

    /**
     * 无参数错误代码
     **/
    public static final int IResult_ParamMissing_Code = -1200;

    /**
     * 参数错误代码
     **/
    public static final int IResult_ParamError_Code = -1201;

    /**
     * 参数为空错误代码
     **/
    public static final int IResult_ParamEmpty_Code = -1202;

    /**
     * 网络错误代码
     */
    public static final int Network_Error_Code = -1203;

}
