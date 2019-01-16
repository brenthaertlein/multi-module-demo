package com.nodemules.spring.users.service.core;

import java.util.UUID;

public interface UsersOperations {

  /**
   * Gets a user by UUID
   */
  UserModel get(UUID userId);
}
