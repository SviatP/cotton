package com.bionic.baglab.controllers;

import com.bionic.baglab.dao.UserDao;
import com.bionic.baglab.domains.UserEntity;
import com.bionic.baglab.dto.user.UserDto;
import com.bionic.baglab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * China-manager controller
 */

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    UserService userService;

    @Autowired
    UserDao userDao;

    private final String managerRole = "Factory"; //todo: delete temp constant

    @RequestMapping(value = "/list", method = RequestMethod.GET) //List USERS with ROLE manager
    public List<UserEntity> listAllManagers(){
//        Set<UserDto> managers = userService.getAllUsersByRole(managerRole);
        List<UserEntity> list = (List<UserEntity>) userDao.findAllByRoleName(managerRole);
  //      if(managers.isEmpty()){
           // return new ResponseEntity<Set<UserDto>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
    //    }
        return list;
    }
    //@RequestMapping(value = "/orders")  //Manager. List all orders that was approved by Moderator + models in them
    //@RequestMapping(value = "/send") //Manager. Change orders status to "Send"






}
