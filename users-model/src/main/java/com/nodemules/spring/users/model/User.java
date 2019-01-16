package com.nodemules.spring.users.model;

import java.io.Serializable;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User implements Serializable {

  private UUID id;
}
