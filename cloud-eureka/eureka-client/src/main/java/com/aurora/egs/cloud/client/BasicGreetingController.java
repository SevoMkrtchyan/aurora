package com.aurora.egs.cloud.client;

import com.aurora.egs.cloud.client.clients.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class BasicGreetingController {

  @Value("${app.service.name}")
  private String serviceName;

  @Value("${app.service.icon}")
  private int iconCode;

  @Autowired private UserClient userClient;

  /**
   * Returns a greeting message with an icon.
   *
   * @return greeting message
   */
  @GetMapping
  public String getGreeting() {
    final String greeting =
        new StringBuilder(new String(Character.toChars(iconCode)))
            .append(" ")
            .append("Hello from ")
            .append(serviceName)
            .toString();
    return greeting + userClient.getMessage();
  }
}
