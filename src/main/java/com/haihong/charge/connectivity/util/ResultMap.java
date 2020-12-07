package com.haihong.charge.connectivity.util;


import java.io.Serializable;
import java.util.HashMap;

public class ResultMap extends HashMap implements Serializable {
    public ResultMap(){
        super();
        this.put("code", Constants.RESULT_RETURN_SUCCESS_CODE);
        this.put("msg", Constants.RESULT_RETURN_SUCCESS_MSG);
    }

    public void catchException(Exception e){
        if(e instanceof ProcessControlException){
            this.put("code", Constants.RESULT_RETURN_EXCEPTION_CODE);
            this.put("msg", e.getMessage());
        }else if(e instanceof Exception){
            this.put("code", Constants.RESULT_RETURN_ERROR_CODE);
            this.put("msg", Constants.SYSTEM_ERROR_MSG);
        }
    }

    public void setCode(Integer code) {
        this.put("code", code);
    }

    public void setMsg(String msg) {
        this.put("msg", msg);
    }

    public void setData(Object data) {
        this.put("data", data);
    }

    public void setTotalCount(long totalCount) {
        this.put("totalRows", totalCount);
    }

    public void setPageNo(Integer pageNo) {
        this.put("pageNo", pageNo);
    }
}
