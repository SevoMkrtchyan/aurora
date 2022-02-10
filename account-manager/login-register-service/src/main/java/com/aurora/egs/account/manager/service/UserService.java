package com.aurora.egs.account.manager.service;

import com.aurora.egs.account.manager.request.UserRequestForLogin;
import com.aurora.egs.account.manager.request.UserRequestForRegister;
import com.aurora.egs.account.manager.responce.UserResponse;

public interface UserService {
  void registerUser(UserRequestForRegister userRequest);

  UserResponse loginUser(UserRequestForLogin userRequest);
}
