/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.employee.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mock.demo.employee.entity.EmployeeVO;


@Repository
public class EmployeeDao {

	private Map<Integer, EmployeeVO> map = new HashMap<>();
    
    public List<EmployeeVO> getEmployeeList() 
    {
        List<EmployeeVO> list = new ArrayList<>();
        if(list.isEmpty()) {
            list.addAll(map.values());
        }
        return list;
    }
     
    public EmployeeVO getEmployeeById(int id) {
        return map.get(id);
    }
     
    public void addEmployee(EmployeeVO employee) {
        employee.setEmployeeId(map.keySet().size() + 1);
        map.put(employee.getEmployeeId(), employee);
    }
     
    public void updateEmployee(EmployeeVO employee) {
        map.put(employee.getEmployeeId(), employee);
    }
     
    public void deleteEmployee(int id) {
        map.remove(id);
    }
	
}
