package com.mock.demo.title.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mock.demo.title.entity.Title;
import com.mock.demo.title.servcie.TitleService;
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TitleServiceTest {
	
	
    @Autowired
    private TitleService titleService;
    
    
    @Test
    @Rollback(false)
    public void testSaveIdTile() {
        Title idTitle = new Title();
        idTitle.setTitle("我是Service的测试数据");
        titleService.saveTitle(idTitle);
    }

//    @Test
//    public void testDeleteTitle() {
//        System.out.println(titleService.deleteTitle(3));
//    }
//
//    @Test
//    public void testUpdateTitle() {
//        Title idTitle = new Title();
//        idTitle.setId(2);
//        idTitle.setTitle("我是Service的测试数据，我被修改过");
//        System.out.println(titleService.updateTitle(idTitle));
//    }
//
//    @Test
//    public void testGetTitleById() {
//        System.out.println(titleService.getTitleById(2));
//    }
//
//    @Test
//    public void testGetTitleList() {
//        System.out.println(titleService.getTitleList());
//    }
}