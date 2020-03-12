package com.wht.springcloud.house.apigateway.common;

/**
 * 响应结果类，所有的响应结果都以此类展示
 */
public class RestResponse<T>  {

    private int code;

    private String msg;

    private T result;

    //默认构造器返回成功
    public RestResponse() {
        this(RestCode.OK.code,RestCode.OK.msg);
    }

    public RestResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static <T> RestResponse<T> success(){
        RestResponse<T> response = new RestResponse<T>();
        return response;
    }

    public static <T> RestResponse<T> success(T result){
        RestResponse<T> response = new RestResponse<T>();
        response.setResult(result);
        return response;
    }

    public static <T> RestResponse<T> error(RestCode code){
        RestResponse<T> response = new RestResponse(code.code,code.msg);
        return null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
