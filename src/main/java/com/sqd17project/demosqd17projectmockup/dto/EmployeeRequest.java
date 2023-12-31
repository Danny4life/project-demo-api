package com.sqd17project.demosqd17projectmockup.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeRequest {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
