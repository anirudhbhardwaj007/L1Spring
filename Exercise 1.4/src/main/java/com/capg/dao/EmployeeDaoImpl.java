package com.capg.dao;

import com.capg.entities.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class EmployeeDaoImpl implements IEmployeeDao{

    private Map<Integer,Employee>store=new HashMap<>();

    public EmployeeDaoImpl(){
        store.put(1,new Employee(101,"Anirudh",40000));
        store.put(2,new Employee(102,"Krishna",40000));
    }


    @Override
    public List<Employee> listAllEmployees() {
        Collection<Employee>employees=store.values();
        List<Employee> empList=new ArrayList<>(employees);
        return empList;
    }
}
