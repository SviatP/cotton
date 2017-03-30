package com.bionic.baglab.services;


import com.bionic.baglab.dao.UserDao;
import com.bionic.baglab.domains.UserEntity;
import com.bionic.baglab.dto.user.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;


    /**
     *
     * @return   List<UserLightDto> - all users without password
     */

    public List<UserDto> getAllUsers(){
        List<UserEntity> userEntities = null;
        List<UserDto> userDtos;
        try {
            userEntities = (List<UserEntity>) userDao.findAll();
        }
        catch (Exception ex) {
            System.out.println("error, no users found: " + ex); //todo: logging
        }
        userDtos = userEntities.stream()        //make list of userDto from userEntity list
                .map(userEntity -> new UserDto(userEntity))
                .collect(Collectors.toList());
    return userDtos;
    }



}
