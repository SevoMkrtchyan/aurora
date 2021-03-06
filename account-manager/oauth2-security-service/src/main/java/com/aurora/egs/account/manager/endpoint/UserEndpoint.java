package com.aurora.egs.account.manager.endpoint;

import com.aurora.egs.account.manager.model.User;
import com.aurora.egs.account.manager.request.UserRequestForLogin;
import com.aurora.egs.account.manager.request.UserRequestForRegister;
import com.aurora.egs.account.manager.responce.UserResponse;
import com.aurora.egs.account.manager.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserEndpoint {
  private final UserService userService;

  @PostMapping("/register")
  public ResponseEntity<?> registerUser(@RequestBody UserRequestForRegister userRequest) {
    userService.registerUser(userRequest);
    return ResponseEntity.ok().build();
  }

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody UserRequestForLogin request) {
    UserResponse userResponse = userService.loginUser(request);
    return ResponseEntity.ok().body(userResponse);
  }

  @GetMapping("/users")
  public ResponseEntity<List<User>> getUsers() {
    return ResponseEntity.ok().body(userService.findAllUsers());
  }
}
