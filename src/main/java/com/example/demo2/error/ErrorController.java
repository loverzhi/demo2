/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ErrorController
 * Author:   Administrator
 * Date:     2018/10/25 0025 下午 6:06
 * Description: 异常处理类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo2.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈异常处理类〉
 *
 * @author Administrator
 * @create 2018/10/25 0025
 * @since 1.0.0
 */
@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> handleControllerException(Throwable ex){
        Map<String,Object> maps = new HashMap<>();
        maps.put("errorCode",500);
        maps.put("errorMessage",ex.getMessage());
        return maps;
    }


}
