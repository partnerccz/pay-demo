package com.pay.wechat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author partner
 * @date 2018/6/11 16:32
 */
@Controller
public class IndexController {

    @RequestMapping("/helloworld")
    public String hello() {
        System.out.println("hello world");
        return "success";
    }
}
