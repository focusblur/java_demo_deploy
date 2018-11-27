package com.winning.java_demo_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangchen on 2018/11/27
 */
@RestController
public class TestController {
	@GetMapping("getname")
	public Map<String,String> getName(String name){
		HashMap<String, String> map = new HashMap<>();
		map.put("name",name);
		return map;
	}
}
