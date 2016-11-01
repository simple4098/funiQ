package com.springapp.mvc.controller;

import com.alibaba.fastjson.JSONObject;
import com.springapp.mvc.domain.Result;
import com.tomasky.fqxz.common.em.ResultCode;
import com.tomasky.fqxz.common.exception.BusinessException;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by LZQ
 * Date: 2016/10/17
 * Time: 14:05
 */
public class BaseController {
    protected transient final Logger log  =  Logger.getLogger(this.getClass());

    @Resource
    protected HttpServletRequest request;

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }


    /**
     * 解析对象
     * @param name 对象参数名
     * @param clazz 对象类型
     * @return 对象
     */
    protected <T> T getObjectParameter(String name, Class<T> clazz) {
        return getObjectParameter(name, clazz,false);
    }
    /**
     * 解析对象
     * @param name 对象参数名
     * @param clazz 对象类型
     * @param createNew 出错时是否返回初始化对象
     * @return 对象
     */
    protected <T> T getObjectParameter(String name, Class<T> clazz,boolean createNew) {
        String value = request.getParameter(name);
        T obj = null;
        try {
            obj = JSONObject.parseObject(value, clazz);
        } catch (Exception e) {
            log.warn("解析["+name+"]对象错误",e);
            if(!createNew){
                throw new BusinessException(ResultCode.PARAM_ERROR.getStatus(), "解析对象["+name+"]参数错误");
            }else{
                try {
                    obj = clazz.newInstance();
                } catch (InstantiationException e1) {
                    e1.printStackTrace();
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return obj;
    }


    /**
     * 返回成功结果（单个数据对象）
     *
     * @param object 数据对象
     * @return 返回内容
     */
    protected Result successResponse(Object object) {
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(object);
        return result;
    }

    /**
     * 返回成功结果（不需返回数据）
     *
     * @return 结果内容
     */
    protected Result successResponse() {
        return successResponse(null);
    }

    /**
     * 返回错误信息
     *
     * @param code 状态
     * @param msg 消息
     * @return 结果内容
     */
    protected Result errorResponse(String code, String msg) {
        return errorResponse(code, msg, null);
    }

    /**
     * 返回错误信息
     *
     * @param code 状态
     * @param msg 消息
     * @param object 数据内容
     * @return
     */
    protected Result errorResponse(String code, String msg, Object object) {
        Result result = new Result();
        result.setStatus(code);
        result.setSuccess(false);
        result.setMessage(msg);
        return result;
    }
}
