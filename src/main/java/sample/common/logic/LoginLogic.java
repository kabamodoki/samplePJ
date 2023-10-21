package sample.common.logic;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import sample.common.dao.entity.User;
import sample.common.dao.mapper.UserMapper;

@Component
public class LoginLogic {

    @Value("${password.hash.code}")
    private String hashCode;

    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 
     * パスワードのハッシュ化を行います
     * 
     * @param password
     * @return
     * @throws NoSuchAlgorithmException
     */
    public byte[] passwordHashing(String password) throws NoSuchAlgorithmException {

        // パスワードのハッシュ化
        MessageDigest md = MessageDigest.getInstance(hashCode);
        byte[] passHash = md.digest(password.getBytes());

        return passHash;
    }

    public User getLoginUser(String email, byte[] password) {
        User searchUser = new User();
        searchUser.setEmail_address(email);
        searchUser.setPassword(password);
        return userMapper.userSearch(searchUser);
    }

}
