package com.test;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calc")
public class MyController {
    @GetMapping("sum")
    public String get(@RequestParam int a, @RequestParam int b) {
        String s = RandomStringUtils.randomAlphanumeric(500);
        String s1 = RandomStringUtils.randomNumeric(1);
        String s2 = RandomStringUtils.randomNumeric(1);
        //int k1 = Integer.parseInt(s1);
        //int k2 = Integer.parseInt(s2);
        int sum1 = a + b;
        return "1е число - (" + s1 + ") + " + "2е число - (" + s2 + ") = " + sum1 + "\n" + s;
    }
    @GetMapping("sub")
    public int sub(@RequestParam int a, @RequestParam int b) {
        int sub1 = a - b;
        return sub1;
    }
}
