package edu.etime.ssmtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试程序Controller
 *
 * @author yjh
 * @date 2019/10/18 0:54
 *
 */

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hellotest")
    public String helloTest(){
        return "test";
    }

}