package com.aurora.egs.account.manager.security;

import com.aurora.egs.account.manager.model.User;
import com.aurora.egs.account.manager.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  @Autowired private UserRepository userRepository;

  @Override
  public CurrentUser loadUserByUsername(String s) throws UsernameNotFoundException {
    Optional<User> user = userRepository.findByEmail(s);
    if (user.isEmpty()) {
      throw new UsernameNotFoundException("user with" + s + "does not exist");
    }
    return new CurrentUser(user.get());
  }
}
