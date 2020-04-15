/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.employee.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.mock.demo.employee.dao.EmployeeDao;
import com.mock.demo.employee.entity.EmployeeVO;

//@RunWith(MockitoJUnitRunner.class)
public class TestEmployeeService {

	@InjectMocks
    EmployeeServcie manager;    
    @Mock
    EmployeeDao dao;   
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }  
    
    @Test
    public void testGetEmployeeList(){
    	List<EmployeeVO> list = new ArrayList<EmployeeVO>();
        EmployeeVO empOne = new EmployeeVO(1, "John", "John", "John@email.com");
        EmployeeVO empTwo = new EmployeeVO(2, "Alex", "Alex", "Alex@yahoo.com");
        EmployeeVO empThree = new EmployeeVO(3, "Steve", "Steve", "Steve@gmail.com");        
        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);        
        when(dao.getEmployeeList()).thenReturn(list);  
        //test
        List<EmployeeVO> empList = manager.getEmployeeList();         
        assertEquals(3, empList.size());
        Mockito.verify(dao, times(1)).getEmployeeList();
    }
    
    @Test
    public void testGetEmployeeById()
    {
        Mockito.when(dao.getEmployeeById(1)).thenReturn(new EmployeeVO(1,"admin1","admin2","user@email.com")).
        thenReturn(new EmployeeVO(1,"admin3","admin4","user@email.com"));
         
        EmployeeVO emp = manager.getEmployeeById(1);
         
        assertEquals("admin1", emp.getFirstName());
        assertEquals("admin2", emp.getLastName());
        assertEquals("user@email.com", emp.getEmail());
    }
     
    @Test
    public void testAddEmployee()
    {
        EmployeeVO emp = new EmployeeVO(1,"admin1","admin2","user@email.com");
         
        manager.addEmployee(emp);
         
        Mockito.verify(dao, times(1)).addEmployee(emp);
    }
    
    
}
