package com.mock.demo.title.dao;

import java.util.List;

import com.mock.demo.title.entity.Title;




public interface TitleMapper {
	
    

    int insert(Title record);

    int insertSelective(Title record);

    Title selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);

    List<Title> selectList();
    
    int deleteByPrimaryKey(Integer id);
}