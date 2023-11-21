package com.testhtml.testhtml.controller;


import com.testhtml.testhtml.service.testService;
import gui.ava.html.link.LinkInfo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @Autowired
    private testService testService;

    @GetMapping("/test")
    public String testApi(HttpServletRequest request) {

        String strHtml = testService.getRendertoJsoup(request);

        return strHtml;
    }

    @GetMapping("/testFile")
    public List<gui.ava.html.link.LinkInfo> testFileApi(HttpServletRequest request) {

        List<LinkInfo> link = testService.getFileRender(request);

        return link;
    }


}
