package com.aurora.egs.feign.client.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class BasicGreetingController {

  /**
   * Returns a greeting message with an icon.
   *
   * @return greeting message
   */
  @GetMapping
  public String getGreeting() {
    return "greeting";
  }

  @GetMapping("/getMessage")
  public String getMessage() {
    return "feign test successfully passed";
  }
}
