package com.sensei.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParentUserRequestDTO {

    private String id;
    @NotNull
    private String name;
    @NotNull
    private String userName;
    @NotNull
    @Email
    private String email;
    @NotNull
    private String phone;
    @NotNull
    private String password;
    @NotNull
    private String maritalStatus;
    @NotNull
    private String occupation;
    @NotNull
    private Date dateOfBirth;
    @NotNull
    private String relationWithChildren;
    private String spouseName;
    private String spouseGender;
    private String spouseEmail;
    private String spousePhone;
    private String spouseOccupation;
    private Date spouseDateOfBirth;
    private String spouseRelationWithChild;


}
