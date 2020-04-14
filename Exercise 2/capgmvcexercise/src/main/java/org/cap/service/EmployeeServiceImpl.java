package org.cap.service;

import org.cap.dao.IEmployeeDao;
import org.cap.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService{


    private IEmployeeDao employeeDao;

    public IEmployeeDao getEmployeeDao(){
        return employeeDao;
    }

    @Autowired
    public void setEmployeeDao(IEmployeeDao dao){
        this.employeeDao=dao;
    }

    public EmployeeServiceImpl(){
    }

    public EmployeeServiceImpl(IEmployeeDao  dao){
        this.employeeDao=dao;
    }

    @Override
    public Employee save(Employee employee) {
        employee=employeeDao.save(employee);
        return employee;
    }

    @Override
    public Employee findById(int id) {
       Employee employee= employeeDao.findById(id);
        return employee;
    }

    @Override
    public  boolean credentialsCorrect(int id, String password){
       boolean correct= employeeDao.credentialsCorrect(id,password);
       return correct;
    }
}
