package com.qf.shop.common.pojo.dto;

/**
 * 这是一个类,用于传输数据.返回给前端layui的数据的封装在此类中
 * 根据layui的table数据接收要求,需要四个属性:
 * mes,code,data,count,但是此处导入索引,不需要显示表格
 * Created by Administrator on 2018/9/15.
 */
public class ResultMessage {
    private boolean success;
    private Object data;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
