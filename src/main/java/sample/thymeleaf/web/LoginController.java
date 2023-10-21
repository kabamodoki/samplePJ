package sample.thymeleaf.web;

import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.annotation.Resource;
import sample.common.service.impl.LoginServiceImpl;

@Controller
public class LoginController {

    @Resource
    LoginServiceImpl loginServiceImpl;

    // -----------------------------------------------------------
    //  GET http://localhost:8080/login
    // -----------------------------------------------------------
    @GetMapping("/login")
    public String getLogin(Model model) {

        return "login";
    }

    // -----------------------------------------------------------
    //  POST http://localhost:8080/login
    // -----------------------------------------------------------
    @PostMapping("/login")
    public String postLogin(@RequestParam("email") String email, @RequestParam("password") String password, Model model) throws NoSuchAlgorithmException {

        // メールアドレスとパスワードでログイン可能かをチェックします
        boolean result = loginServiceImpl.LoginVerification(email, password);

        if (result) {
            return "homePage";
        } else {
            model.addAttribute("errMessage", "入力した情報に誤りがあります、再度確認し入力して下さい。");
            return "login";
        }

    }

}
