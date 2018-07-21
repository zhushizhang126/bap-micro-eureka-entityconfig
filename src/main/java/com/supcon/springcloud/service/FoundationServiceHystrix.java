package com.supcon.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class FoundationServiceHystrix implements FoundationService {

	@Override
	public String getFoundation() throws Exception {
		// TODO Auto-generated method stub
		return "sorry web is over";
	}

}
