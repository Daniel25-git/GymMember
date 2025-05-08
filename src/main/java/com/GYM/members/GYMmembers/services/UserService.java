package com.GYM.members.GYMmembers.services;
import com.GYM.members.GYMmembers.dtos.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    List<UserDto> getAllUsers();
    UserDto getUserById(int id);
    UserDto updateUserById(int id, UserDto userDto);
    String deleteUserById(int id);
}
