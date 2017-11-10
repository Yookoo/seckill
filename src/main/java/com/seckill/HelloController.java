package com.seckill;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World 控制器
 * @author <a href="https://yookoo.github.com">Yookoo</a> 
 * @date 2017年10月23日 09:44:15
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
	    return "Hello World!";
	}
}
