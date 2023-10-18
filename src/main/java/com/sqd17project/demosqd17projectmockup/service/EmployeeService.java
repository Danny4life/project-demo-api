package com.sqd17project.demosqd17projectmockup.service;

import com.sqd17project.demosqd17projectmockup.dto.EmployeeRequest;

import java.util.List;

public interface EmployeeService {

    EmployeeRequest createEmployee(EmployeeRequest employeeRequest);

    List<EmployeeRequest> getAllEmployees();
}
