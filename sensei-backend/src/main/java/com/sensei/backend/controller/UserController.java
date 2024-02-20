package com.sensei.backend.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sensei.backend.dto.ParentUserRequestDTO;
import com.sensei.backend.entities.ParentUser;
import com.sensei.backend.service.UserApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    UserApiService apiservice;

    @PostMapping("sensei/api/v1/create/parent")
    public String createParentUser(@RequestBody @Valid ParentUserRequestDTO parentUserRequestDTO) throws JsonProcessingException {
       return apiservice.createParentUser(parentUserRequestDTO);
    }




}
