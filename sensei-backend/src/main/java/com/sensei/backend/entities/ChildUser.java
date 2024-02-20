package com.sensei.backend.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChildUser {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String id;
    @NotNull
    private String parentUserId;
    @NotNull
    private String childName;
    @NotNull
    private String schoolId;
    @NotNull
    private String Grade;
    @NotNull
    private Date dateOfBirth;
    @NotNull
    private boolean visitingCounsellor;
    @NotNull
    private boolean anyMedicalHistory;
    private String medicalHistoryDescription;
    @NotNull
    private String bloodGroup;







}
