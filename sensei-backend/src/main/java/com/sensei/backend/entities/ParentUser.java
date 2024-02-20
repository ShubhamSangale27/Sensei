package com.sensei.backend.entities;

import javax.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"user_name"})})
public class ParentUser {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String id;
    private String name;
    @Column(name = "user_name")
    private String userName;
    private String email;
    private String phone;
    private String password;
    private String maritalStatus;
    private String occupation;
    private Date dateOfBirth;
    private String relationWithChildren;
    private String spouseName;
    private String spouseGender;
    private String spouseEmail;
    private String spousePhone;
    private String spouseOccupation;
    private Date spouseDateOfBirth;
    private String spouseRelationWithChild;


}
