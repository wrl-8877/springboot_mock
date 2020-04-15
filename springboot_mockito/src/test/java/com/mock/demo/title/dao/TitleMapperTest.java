package com.mock.demo.title.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mock.demo.title.entity.Title;




@RunWith(SpringRunner.class)
@SpringBootTest
public class TitleMapperTest {
    @Autowired
    private TitleMapper titleMapper;

   
    /**
     * 
     * <B>方法名称：</B>testInsertSelective<BR>
     * <B>概要说明：</B>添加<BR>
     */
    @Test
    @Transactional
    @Rollback(false)
    public void testInsertSelective() {
        Title title = new Title();
        title.setTitle("我是Dao的测试数据");
        titleMapper.insertSelective(title);
        Assert.assertEquals("我是Dao的测试数据", title.getTitle());
    }
    /**
     * 
     * <B>方法名称：</B>testSelectByPrimaryKey<BR>
     * <B>概要说明：</B>查询<BR>
     */
    @Test
    public void testSelectByPrimaryKey() {
        Title title = titleMapper.selectByPrimaryKey(124);
        Assert.assertEquals("我是Dao的测试数据", title.getTitle());
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testUpdateByPrimaryKeySelective() {
        Title title = titleMapper.selectByPrimaryKey(109);
        title.setTitle("我是Dao的测试数据，我被修改了，我又被修改了");
        titleMapper.updateByPrimaryKey(title);
        Title title2 = titleMapper.selectByPrimaryKey(109);
        Assert.assertEquals("我是Dao的测试数据，我被修改了，我又被修改了", title2.getTitle());
    }

//    @Test
//    public void testUpdateByPrimaryKey() {
//        Title title = titleMapper.selectByPrimaryKey(12);
//        title.setTitle("我是Dao的测试数据，我被修改了");
//        titleMapper.updateByPrimaryKey(title);
//        Title title2 = titleMapper.selectByPrimaryKey(12);
//        Assert.assertEquals("我是Dao的测试数据，我被修改了", title2.getTitle());
//    }

    @Test
    @Rollback
    public void testSelectList() {
        System.out.println(titleMapper.selectList());
    }
    
    @Test
    public void testDeleteByPrimaryKey() {
        titleMapper.deleteByPrimaryKey(12);
        Title title = titleMapper.selectByPrimaryKey(12);
        Assert.assertNull(title);
    }
}