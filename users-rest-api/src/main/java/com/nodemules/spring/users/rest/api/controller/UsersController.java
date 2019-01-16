package com.nodemules.spring.users.rest.api.controller;

import com.nodemules.spring.users.model.User;
import com.nodemules.spring.users.rest.UsersControllerOperations;
import com.nodemules.spring.users.rest.api.mapper.UsersMapper;
import com.nodemules.spring.users.service.core.UsersOperations;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UsersController implements UsersControllerOperations {

  private final UsersOperations usersOperations;
  private final UsersMapper usersMapper;

  @Override
  public User getUser(UUID userId) {
    return usersMapper.toPojo(usersOperations.get(userId));
  }
}
