package com.mock.demo.title.servcie;

import java.util.List;

import com.mock.demo.title.entity.Title;




public interface TitleService {
	
    int saveTitle(Title title);

    int deleteTitle(Integer id);

    int updateTitle(Title Title);

    Title getTitleById(Integer id);

    List<Title> getTitleList();
}
