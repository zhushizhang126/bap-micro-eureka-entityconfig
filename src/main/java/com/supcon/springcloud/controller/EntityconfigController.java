package com.supcon.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supcon.springcloud.service.FoundationService;

@RestController
@RequestMapping("/entityconfig")
public class EntityconfigController {

	@Autowired
	private FoundationService foundationService;
	/**
	 * 
	 * <p>Title: getFoundation</p>  
	 * <p>Description: 微服务从foundation中获取数据</p>  
	 * @author zhushizhang  
	 * @date 2018年6月23日
	 * @return
	 */
	@RequestMapping("/helloEntityconfig")
	public String getFoundation(){
		String foundationInfo = null;
		try {
			foundationInfo = foundationService.getFoundation();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return foundationInfo;
	}
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
}
