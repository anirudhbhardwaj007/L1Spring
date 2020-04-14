package org.cap.service;

import org.cap.entities.Employee;
import org.springframework.stereotype.Component;

public interface IEmployeeService {

    Employee save(Employee employee);

    Employee findById(int id);

    boolean credentialsCorrect(int id, String password);
}
