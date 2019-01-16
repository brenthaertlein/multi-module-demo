package com.nodemules.spring.users.rest.api.mapper;

import com.nodemules.spring.users.model.User;
import com.nodemules.spring.users.service.core.UserModel;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

@Mapper(
    withIoC = IoC.SPRING
)
public interface UsersMapper {

  User toPojo(UserModel model);
}
