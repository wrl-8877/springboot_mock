package com.mock.demo.title.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mock.demo.title.entity.Title;
import com.mock.demo.title.servcie.TitleService;



@RestController
@RequestMapping(value = "junit")
public class TitleController {
	
    @Autowired
    private TitleService titleService;

    /**
     * 
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B>添加<BR>
     * @param Title
     * @return
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    int save(@RequestBody Title Title) {
        return titleService.saveTitle(Title);
    }
    /**
     * 
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B>删除<BR>
     * @param id
     * @return
     */
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    int delete(@RequestParam(value = "id") Integer id) {
        return titleService.deleteTitle(id);
    }
    /**
     * 
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B>修改<BR>
     * @param Title
     * @return
     */
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    int update(@RequestBody Title Title) {
        return titleService.updateTitle(Title);
    }
    /**
     * 
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B>查询<BR>
     * @param id
     * @return
     */
    @RequestMapping(value = "get", method = RequestMethod.GET)
    Title get(@RequestParam(value = "id") Integer id) {
        return titleService.getTitleById(id);
    }
    /**
     * 
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B>查询集合<BR>
     * @return
     */
    @RequestMapping(value = "info",method = RequestMethod.GET)
    List<Title> info() {
        return titleService.getTitleList();
    }
}
