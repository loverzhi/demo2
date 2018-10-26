/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: IndexController
 * Author:   Administrator
 * Date:     2018/10/25 0025 下午 2:09
 * Description: 首页控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈首页控制器〉
 *
 * @author Administrator
 * @create 2018/10/25 0025
 * @since 1.0.0
 */
@Controller
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class.getName());

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        return "login";
    }

    @RequestMapping("/help")
    public String help() {
        return "help";
    }


    @RequestMapping("/testError")
    @ResponseBody
    public Map<String,Object> error() {
        Map<String,Object> maps = new HashMap<String,Object>();
        maps.put("name","zhangsan");
        maps.put("age",18);
        int i = 1/0;
        return maps;
    }

}
