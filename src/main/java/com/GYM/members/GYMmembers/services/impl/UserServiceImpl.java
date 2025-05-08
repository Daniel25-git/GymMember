package com.GYM.members.GYMmembers.services.impl;

import com.GYM.members.GYMmembers.dtos.GymDto;
import com.GYM.members.GYMmembers.dtos.UserDto;
import com.GYM.members.GYMmembers.entities.Gym;
import com.GYM.members.GYMmembers.entities.User;
import com.GYM.members.GYMmembers.mappers.UserMapper;
import com.GYM.members.GYMmembers.repositories.UserRepository;
import com.GYM.members.GYMmembers.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDto createUser(UserDto userDto) {
       User user = userMapper.mapToMapper(userDto);
       User savedUser = userRepository.save(user);
       UserDto output = userMapper.mapToUserDto(savedUser);
       return output;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserDto getUserById(int id) {
        return null;
    }

    @Override
    public UserDto updateUserById(int id, UserDto userDto) {
        return null;
    }

    @Override
    public String deleteUserById(int id) {
        return "";
    }
}
