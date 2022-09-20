package com.example.hahaton.controllers;

import com.example.hahaton.DAO.RoleDAO;
import com.example.hahaton.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Api(value = "CringeController", description = "Controller of cringe")
@RequiredArgsConstructor
public class CringeController {

    private final RoleDAO roleDAO;

    @ApiOperation(value = "Test controller")
    @GetMapping("/testController")
    private @ResponseBody User testController (@ApiParam(value = "User JSON") @RequestBody User user) {
        return user;
    }
}
