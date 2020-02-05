package com.wjt.polly.common;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

//全局异常捕捉处理
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex) {
        Map map = new HashMap();
        map.put("code", 400);
        //判断异常的类型,返回不一样的返回值
        if(ex instanceof MissingServletRequestParameterException){
            map.put("msg","缺少必需参数："+((MissingServletRequestParameterException) ex).getParameterName());
        }
        else{
            StringWriter stringWriter = new StringWriter();
            ex.printStackTrace(new PrintWriter(stringWriter));
            map.put("msg",stringWriter.toString());
        }
//        else if(ex instanceof MyException){
//            map.put("code", ex.getCode());
//            map.put("msg", ex.getMsg());
//        }
        return map;
    }


}
