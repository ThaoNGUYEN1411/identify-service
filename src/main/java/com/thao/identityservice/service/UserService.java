package com.thao.identityservice.service;

import com.thao.identityservice.dto.request.UserCreationRequest;
import com.thao.identityservice.entity.User;
import com.thao.identityservice.mapper.UserMapper;
import com.thao.identityservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User updateUser(Long id, UserCreationRequest request) {
        User user = getUserById(id);

        user.setUsername(request.getUsername());
        user.setUsername(request.getUsername());
        user.setLastName(request.getLastName());
        user.setPassword(request.getPassword());
        user.setBirthdate(request.getBirthdate());

        return userRepository.save(user);

    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
