/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.demo.employee.dao.EmployeeDao;
import com.mock.demo.employee.entity.EmployeeVO;


@Service
public class EmployeeServcie {

	@Autowired
    EmployeeDao dao;
     
    public List<EmployeeVO> getEmployeeList() {
        return dao.getEmployeeList();
    }
     
    public EmployeeVO getEmployeeById(int id) {
        return dao.getEmployeeById(id);
    }
     
    public void addEmployee(EmployeeVO employee) {
        dao.addEmployee(employee);
    }
}
