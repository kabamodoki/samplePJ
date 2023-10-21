package sample.common.service.impl;

import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
import sample.common.dao.entity.User;
import sample.common.logic.LoginLogic;
import sample.common.service.LoginService;

@Component
public class LoginServiceImpl implements LoginService {

    @Resource
    LoginLogic loginLogic;

    @Override
    public boolean LoginVerification(String email, String password) throws NoSuchAlgorithmException {

        // パスワードのハッシュ化を行う
        byte[] hashPass = loginLogic.passwordHashing(password);

        // メールとパスワードで整合性チェックを行う
        User result = loginLogic.getLoginUser(email, hashPass);

        boolean isLogin = false;

        if (result != null) {
            isLogin = true;
        }

        return isLogin;
    }

}
