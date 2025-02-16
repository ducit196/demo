package com.duc.demo.service;

import com.duc.demo.model.Employee;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(1);

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(Long id) {
        return employees.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        employee.setId(counter.getAndIncrement());
        employees.add(employee);
        return employee;
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                e.setName(updatedEmployee.getName());
                e.setRole(updatedEmployee.getRole());
                return e;
            }
        }
        return null;
    }

    public boolean deleteEmployee(Long id) {
        return employees.removeIf(e -> e.getId().equals(id));
    }
}
