package org.scoula.icecream.controller;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.config.RootConfig;
import org.scoula.config.ServletConfig;
import org.scoula.icecream.service.IcecreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@ContextConfiguration(classes = {
        RootConfig.class,
        ServletConfig.class
})
@Log4j2
class IcecreamControllerTest {
    @Autowired
    IcecreamService service;

    @Autowired
    private WebApplicationContext ctx;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }

    @Test
    public void list() throws Exception{
        ModelMap model = mockMvc.perform(MockMvcRequestBuilders.get("/icecream/list"))
                .andReturn()
                .getModelAndView()
                .getModelMap();
        log.info(model);

    }

    @Test
    void create() throws Exception{
        String viewName = mockMvc.perform(MockMvcRequestBuilders.get("/icecream/new"))
                .andReturn()
                .getModelAndView()
                .getViewName();

        log.info(viewName);
    }

    @Test
    public void postCreate() throws Exception {
        String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/icecream/new")
                        .param("name", "유니콘젤리")
                        .param("flavor", "알록달록 젤리가 씹히는 무지개 맛")
                        .param("price", "5000"))
                .andReturn()
                .getModelAndView()
                .getViewName();

        log.info(resultPage);
        assertNotNull(resultPage);
    }



}