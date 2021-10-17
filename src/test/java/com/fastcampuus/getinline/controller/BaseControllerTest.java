package com.fastcampuus.getinline.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@WebMvcTest(BaseController.class)
class BaseControllerTest {

//    @Autowired
//    private MockMvc mvc;

    private final MockMvc mvc;

    public BaseControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @DisplayName("[view][GET] 기본 페이지 요청")
    @Test
    void givenNothing_whenRequestingRootPage_thenReturnsIndexPage() throws Exception {
//    void givenNothing_whenRequestingRootPage_thenReturnsIndexPage(@Autowired MockMvc mvc) throws Exception {
// junit 5에서는 인자로 바로 주입시킬 수 있다.
        // Given

        // When & Then
        mvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
               .andExpect(content().string(containsString("This is default page."))).andExpect(view().name("index"))
               .andDo(print());

    }
}