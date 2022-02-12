package com.aurora.egs.account.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EgsUserCore {

  public static void main(String[] args) {
    SpringApplication.run(EgsUserCore.class);
  }
}
