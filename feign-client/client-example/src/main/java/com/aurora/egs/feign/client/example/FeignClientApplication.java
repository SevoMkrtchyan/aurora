package com.aurora.egs.feign.client.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FeignClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(FeignClientApplication.class);
  }
}
