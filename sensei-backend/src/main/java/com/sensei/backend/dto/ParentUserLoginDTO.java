package com.sensei.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParentUserLoginDTO {

    @NotNull
    private String userName;
    @NotNull
    private String password;

}
