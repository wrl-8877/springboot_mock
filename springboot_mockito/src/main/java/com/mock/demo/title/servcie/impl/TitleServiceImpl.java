package com.mock.demo.title.servcie.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mock.demo.title.dao.TitleMapper;
import com.mock.demo.title.entity.Title;
import com.mock.demo.title.servcie.TitleService;




@Service
public class TitleServiceImpl implements TitleService {
	
    @Autowired
    private TitleMapper titleMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int saveTitle(Title title) {
        return titleMapper.insertSelective(title);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteTitle(Integer id) {
        return titleMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int updateTitle(Title title) {
        return titleMapper.updateByPrimaryKeySelective(title);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Title getTitleById(Integer id) {
        return titleMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Title> getTitleList() {
        return titleMapper.selectList();
    }

}
