package com.aurora.egs.account.manager.service;

import com.aurora.egs.account.manager.model.User;
import com.aurora.egs.account.manager.request.UserRequestForLogin;
import com.aurora.egs.account.manager.request.UserRequestForRegister;
import com.aurora.egs.account.manager.responce.UserResponse;

import java.util.List;

public interface UserService {
    void registerUser(UserRequestForRegister userRequest);

    UserResponse loginUser(UserRequestForLogin userRequest);

    List<User> findAllUsers();


}
