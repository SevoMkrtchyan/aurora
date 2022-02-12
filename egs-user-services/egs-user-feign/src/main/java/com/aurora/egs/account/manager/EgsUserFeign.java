package com.aurora.egs.account.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EgsUserFeign {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(EgsUserFeign.class);
  }
}
