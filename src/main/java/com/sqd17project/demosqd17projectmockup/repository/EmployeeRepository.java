package com.sqd17project.demosqd17projectmockup.repository;

import com.sqd17project.demosqd17projectmockup.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
