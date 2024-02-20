package com.sensei.backend.service;


import com.sensei.backend.dto.ParentUserRequestDTO;
import com.sensei.backend.dto.ParentUserLoginDTO;
import com.sensei.backend.entities.ParentUser;
import com.sensei.backend.exception.IncorrectPasswordException;
import com.sensei.backend.exception.UserNotFoundException;
import com.sensei.backend.repository.ParentUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.PasswordAuthentication;

@Service
public class AuthApiService {

    @Autowired
    ParentUserRepository parentUserRepository;

    public ParentUserRequestDTO loginParent(ParentUserLoginDTO parentUserLoginDTO) {
        ParentUser parentUser = parentUserRepository.findByUserName(parentUserLoginDTO.getUserName());
        if (null != parentUser) {
            if(parentUser.getPassword().equals(parentUserLoginDTO.getPassword())) {
                return ParentUserRequestDTO.builder()
                        .id(parentUser.getId())
                        .userName(parentUser.getUserName())
                        .name(parentUser.getName())
                        .email(parentUser.getEmail())
                        .phone(parentUser.getPhone())
                        .build();
            }else {
                throw new IncorrectPasswordException();
            }
        } else {
            throw new UserNotFoundException();
        }
    }


}
