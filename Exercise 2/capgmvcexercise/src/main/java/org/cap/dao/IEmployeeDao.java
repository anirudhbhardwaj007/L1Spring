package org.cap.dao;

import org.cap.entities.Employee;

public interface IEmployeeDao {

    Employee save(Employee employee);

    Employee findById(int id);
    boolean credentialsCorrect(int id, String password);


}
