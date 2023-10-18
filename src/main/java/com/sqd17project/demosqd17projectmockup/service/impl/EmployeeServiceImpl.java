package com.sqd17project.demosqd17projectmockup.service.impl;

import com.sqd17project.demosqd17projectmockup.dto.EmployeeRequest;
import com.sqd17project.demosqd17projectmockup.entity.EmployeeEntity;
import com.sqd17project.demosqd17projectmockup.repository.EmployeeRepository;
import com.sqd17project.demosqd17projectmockup.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public EmployeeRequest createEmployee(EmployeeRequest employeeRequest) {
        EmployeeEntity employeeEntity = EmployeeEntity.builder()
                .firstName(employeeRequest.getFirstName())
                .lastName(employeeRequest.getLastName())
                .email(employeeRequest.getEmail())
                .build();

        employeeRepository.save(employeeEntity);


        return employeeRequest;
    }

    @Override
    public List<EmployeeRequest> getAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();

        List<EmployeeRequest> employeeRequests = employeeEntities
                .stream()
                .map(emp -> new EmployeeRequest(emp.getId(),
                        emp.getFirstName(), emp.getLastName(), emp.getEmail()))
                .collect(Collectors.toList());


        return employeeRequests;
    }
}
