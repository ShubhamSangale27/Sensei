package com.sensei.backend.controller;

import com.sensei.backend.dto.ParentUserLoginDTO;
import com.sensei.backend.dto.ParentUserRequestDTO;
import com.sensei.backend.service.AuthApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class SchoolController {


    @Autowired
    AuthApiService service;

    @PostMapping("sensei/api/v1/authenticate/login")
    public ResponseEntity<?> loginParentUser(@RequestBody @Valid ParentUserLoginDTO parentUserLoginDTO) {
        ParentUserRequestDTO parentUserDTO = service.loginParent(parentUserLoginDTO);
        return new ResponseEntity<>(parentUserDTO, HttpStatus.OK);

    }



}
