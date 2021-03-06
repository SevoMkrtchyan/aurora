package com.aurora.egs.account.manager.mapper;

import com.aurora.egs.account.manager.mapper.config.BaseMapper;
import com.aurora.egs.account.manager.model.User;
import com.aurora.egs.account.manager.request.UserRequestForRegister;
import com.aurora.egs.account.manager.responce.UserResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserMapper implements BaseMapper<User, UserRequestForRegister, UserResponse> {
  private final ModelMapper mapper;

  @Override
  public User toEntity(UserRequestForRegister userRequest) {
    User user = mapper.map(userRequest, User.class);
    return user;
  }

  @Override
  public UserResponse toResponse(User user) {
    UserResponse userResponse = mapper.map(user, UserResponse.class);
    return userResponse;
  }
}
