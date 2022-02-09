package com.aurora.egs.cloud.client.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feign-client-example")
public interface UserClient {

  @GetMapping("/greeting/getMessage")
  String getMessage();
}
