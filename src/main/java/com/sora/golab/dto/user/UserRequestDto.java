package com.sora.golab.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String name;
    private String userId;
    private String password;
    private String email;
    private Long universityId;
}
