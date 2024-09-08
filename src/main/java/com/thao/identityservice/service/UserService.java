package com.thao.identityservice.service;

import com.thao.identityservice.dto.request.UserCreationRequest;
import com.thao.identityservice.entity.User;
import com.thao.identityservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createRequest(UserCreationRequest request){
        User user = new User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setBirthdate(request.getBirthdate());

        return userRepository.save(user);
    }
}
