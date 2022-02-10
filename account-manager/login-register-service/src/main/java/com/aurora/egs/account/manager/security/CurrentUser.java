package com.aurora.egs.account.manager.security;

import com.aurora.egs.account.manager.model.User;
import org.springframework.security.core.authority.AuthorityUtils;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

  private User user;

  public CurrentUser(User user) {
    super(user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList());
    this.user = user;
  }

  public User getUser() {
    return user;
  }
}
