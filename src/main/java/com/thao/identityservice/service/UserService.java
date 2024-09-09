package com.thao.identityservice.service;

import com.thao.identityservice.dto.request.UserCreationRequest;
import com.thao.identityservice.entity.User;
import com.thao.identityservice.mapper.UserMapper;
import com.thao.identityservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public User createRequest(UserCreationRequest request){
        User user = userMapper.toEntity(request);

        return userRepository.save(user);
    }
}
