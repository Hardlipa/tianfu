package com.wucy.tianfu.common.util;

import com.wucy.tianfu.domain.common.Result;

public class ResultUtil {

    /**
     * 成功无返回数据
     * @return
     */
    public static Result success() {
        return setXXX(200,"成功",null);
    }

    /**
     * 成功带返回数据
     * @param data 响应数据
     * @return
     */
    public static Result success(Object data) {
        return setXXX(200,"成功",data);
    }

    /**
     * 自定义状态码并带返回数据
     * @param message
     * @param data 响应数据
     * @return
     */
    public static Result success(String message, Object data) {
        return setXXX(200,message,data);
    }

    /**
     * 失败不带返回数据
     * @return
     */
    public static Result failure() {
        return setXXX(500,"失败",null);
    }

    /**
     * 失败
     * @param message
     * @return
     */
    public static Result failure(String message) {
        return setXXX(500,message,null);
    }

    public static Result failure(String message,Object data) {
        return setXXX(500,message,data);
    }
    private static Result setXXX(Integer code,String message,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(message);
        result.setData(data);
        return result;
    }
}
