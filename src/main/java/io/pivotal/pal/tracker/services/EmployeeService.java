package io.pivotal.pal.tracker.services;


import io.pivotal.pal.tracker.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.pivotal.pal.tracker.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployeeList(){
        List<Employee> employeeList= employeeRepository.findAll();

        return employeeList;
    }


}
