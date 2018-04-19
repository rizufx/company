package com.qinsol.insbot.nbapp.service;

import java.util.List;

import com.qinsol.insbot.nbapp.dto.UserDto;

public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}