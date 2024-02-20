package com.sensei.backend.repository;

import com.sensei.backend.entities.ParentUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParentUserRepository extends JpaRepository<ParentUser, String> {

    ParentUser findByUserName(String userName);


}
