package com.supcon.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "bap-micro-eureka-foundation",fallback = FoundationServiceHystrix.class)
public interface FoundationService {

	@GetMapping("/foundation/helloFoundation")
	String getFoundation() throws Exception;
}
