package com.aurora.egs.account.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EgsUserRepository {

  public static void main(String[] args) {
    SpringApplication.run(EgsUserRepository.class);
  }
}
