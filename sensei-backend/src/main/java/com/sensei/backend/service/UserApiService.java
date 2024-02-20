package com.sensei.backend.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sensei.backend.dto.ParentUserRequestDTO;
import com.sensei.backend.entities.ParentUser;
import com.sensei.backend.exception.UserNameAlreadyTakenException;
import com.sensei.backend.repository.ParentUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserApiService {

    @Autowired
    ParentUserRepository parentUserRepository;

    ObjectMapper mapper= new ObjectMapper();

    public String createParentUser(ParentUserRequestDTO parentUserRequestDTO) throws JsonProcessingException {
        if (null == parentUserRepository.findByUserName(parentUserRequestDTO.getUserName())) {
            ParentUser parentUser = mapper.readValue(mapper.writeValueAsString(parentUserRequestDTO),ParentUser.class);
            return parentUserRepository.save(parentUser).getId();
        }
        else
            throw new UserNameAlreadyTakenException();
    }





}
