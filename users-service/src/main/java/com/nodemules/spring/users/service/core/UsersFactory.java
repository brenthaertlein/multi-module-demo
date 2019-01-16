package com.nodemules.spring.users.service.core;

import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class UsersFactory implements UsersOperations {

  @Override
  public UserModel get(UUID userId) {
    UserModel user = new UserModel();
    user.setId(userId);
    return user;
  }
}
