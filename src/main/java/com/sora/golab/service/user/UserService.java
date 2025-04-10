package com.sora.golab.service.user;

import com.sora.golab.domain.user.UserRepository;
import com.sora.golab.dto.user.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void saveUser(UserRequestDto userRequestDto) {

    }
}
