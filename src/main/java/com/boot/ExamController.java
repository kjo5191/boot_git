package com.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ExamController {
	@RequestMapping
	public String home() {
		log.info("hello boot 111 333 222 444");
		System.out.println("실행 잘 되는지 확인 용");
		
		return "hello";
	}
}
