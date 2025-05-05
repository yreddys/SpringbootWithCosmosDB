package com.cosmos.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.cosmos.entity.Employee;

public interface EmployeeRepository extends CosmosRepository<Employee, String> {
}
