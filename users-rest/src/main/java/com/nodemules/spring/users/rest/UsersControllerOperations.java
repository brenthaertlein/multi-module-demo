package com.nodemules.spring.users.rest;

import com.nodemules.spring.users.model.User;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface UsersControllerOperations {

  @GetMapping(value = "/{userId}")
  User getUser(@PathVariable UUID userId);
}
