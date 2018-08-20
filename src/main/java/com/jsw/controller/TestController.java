package com.jsw.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsw.service.OrderCouponService;


@RestController
@RequestMapping("/")
public class TestController {
	@Autowired
    private OrderCouponService orderCouponService;

    /**
     * 列表
     */
    @RequestMapping("/index")
    public String list(){
        return orderCouponService.selectByPrimaryKey(1).toString();
    }
}
