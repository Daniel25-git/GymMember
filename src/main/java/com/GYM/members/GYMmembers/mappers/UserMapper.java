package com.GYM.members.GYMmembers.mappers;
import com.GYM.members.GYMmembers.dtos.UserDto;
import com.GYM.members.GYMmembers.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User mapToMapper(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setUsername(userDto.getUsername());
        user.setProfilePictureUrl(userDto.getProfilePictureUrl());
        user.setCreatedAt(userDto.getCreatedAt());
        user.setUpdatedAt(userDto.getUpdatedAt());
        return user;
    }

    public UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto .setId(user.getId());
        userDto .setFirstName(user.getFirstName());
        userDto .setLastName(user.getLastName());
        userDto .setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto .setUsername(user.getUsername());
        userDto .setProfilePictureUrl(user.getProfilePictureUrl());
        userDto .setCreatedAt(user.getCreatedAt());
        userDto .setUpdatedAt(user.getUpdatedAt());
        return userDto;
    }
}

