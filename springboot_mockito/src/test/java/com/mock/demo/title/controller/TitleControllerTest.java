package com.mock.demo.title.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class  TitleControllerTest {
    //mock测试器
    private MockMvc mockMvc;
    //容器上下文
    @Autowired
    private WebApplicationContext context;

    @Before
    public void init() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
    }

//    @Test
//    @Transactional
//	@Rollback(false)
//    public void testSave() throws Exception {
//        // 创建传递的参数数据
//        Map<String, Object> map = new ConcurrentHashMap<String, Object>();
//        map.put("title", "我是Controller的测试数据");
//
//        // 接收发送请求后的返回结果
//        MvcResult result = mockMvc.perform(
//            // 设置post请求
//            MockMvcRequestBuilders.post("/junit/save")
//                    // 设置消息数据类型
//                    .contentType(MediaType.APPLICATION_JSON_UTF8)
//                    // 设置发送的数据
//                    .content(JSONObject.toJSONString(map))
//                )
//                // 开始模拟发送post请求
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                // 设置返回类型为json
//                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
//                // 抽取返回结果
//                .andReturn();
//        System.out.println(result.getResponse().getContentAsString());
//    }
//
//    @Test
//    public void testDelete() throws Exception {
//        // 构建了一个delete的请求方式
//        RequestBuilder request = MockMvcRequestBuilders.delete("/junit/delete?id=4");
//        MvcResult result = mockMvc.perform(request)
//            // 打印执行过程
//            .andDo(MockMvcResultHandlers.print())
//            .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("1")))
//            .andReturn();
//    }

    @Test
    public void testUpdate() throws Exception {
        Map<String, Object> map = new ConcurrentHashMap<String, Object>();
        map.put("id", "2");
        map.put("title", "我是Controller的测试数据，我被修改了");
        // 构建一个put请求
        RequestBuilder request = MockMvcRequestBuilders.put("/junit/update")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(JSONObject.toJSONString(map));                
        MvcResult result = mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }

//    @Test
//    public void testGet() throws Exception {
//        // 构建了一个get的请求方式
//        RequestBuilder request = MockMvcRequestBuilders.get("/junit/get?id=2");
//        MvcResult result = mockMvc.perform(request)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andReturn();
//        System.out.println(result.getResponse().getContentAsString());
//
//    }

//    @Test
//    public void testInfo() throws Exception {
//        // 构建一个get请求
//        RequestBuilder request = MockMvcRequestBuilders.get("/junit/info");
//        MvcResult result = mockMvc.perform(request)
//            .andExpect(MockMvcResultMatchers.status().isOk())
//            .andReturn();
//        System.out.println(result.getResponse().getContentAsString());
//    }
}