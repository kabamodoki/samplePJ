package sample.thymeleaf.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.annotation.Resource;
import sample.common.service.impl.LoginServiceImpl;

public class HomePageController {
    @Resource
    LoginServiceImpl loginServiceImpl;

    // -----------------------------------------------------------
    //  GET http://localhost:8080/login
    // -----------------------------------------------------------
    @GetMapping("/homePage")
    public String getLogin(Model model) {

        return "homePage";
    }
}
