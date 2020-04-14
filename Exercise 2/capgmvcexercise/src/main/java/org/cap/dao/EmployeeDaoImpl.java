package org.cap.dao;

import org.cap.entities.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
    private Map<Integer, Employee> store = new HashMap<>();

    public EmployeeDaoImpl(){
        Employee employee1=new Employee();
        employee1.setId(1);
        employee1.setName("anirudh");
        employee1.setPassword("abcd");
        store.put(1,employee1);
    }

    @Override
    public Employee save(Employee employee) {
        store.put(employee.getId(), employee);
        return employee;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = store.get(id);
        return employee;
    }

    @Override
    public boolean credentialsCorrect(int id, String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }
        Employee employee = store.get(id);
        if (employee == null) {
            return false;
        }
        return employee.getPassword().equals(password);
    }
}
