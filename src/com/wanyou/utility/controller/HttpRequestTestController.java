package com.wanyou.utility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("httpRequestTestController")
@RequestMapping("/httpRequestTest")
public class HttpRequestTestController {
	@RequestMapping("/test")
	public String requestTest(){
		return "/httpRequestTest/httpRequestTest";
	}
}
