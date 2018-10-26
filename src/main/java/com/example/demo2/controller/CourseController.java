/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CourseController
 * Author:   Administrator
 * Date:     2018/10/25 0025 下午 6:39
 * Description: freemarker测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈freemarker测试〉
 *
 * @author Administrator
 * @create 2018/10/25 0025
 * @since 1.0.0
 */
@Controller
public class CourseController {

    @RequestMapping("/getCourse")
    public ModelAndView getCourse(){

        ModelAndView model = new ModelAndView();
        model.addObject("course","spring boots 2.2");
        List<String> list = new ArrayList<>();
        list.add("JAVA");
        list.add("PYTHON");
        model.addObject("courseList",list);
        model.setViewName("/index");
        return model;
    }
}
