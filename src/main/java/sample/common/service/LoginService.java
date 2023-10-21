package sample.common.service;

import java.security.NoSuchAlgorithmException;

/**
 * ログイン検証service
 */
public interface LoginService {

    /**
     * 
     * メールアドレスとパスワードでログイン可能かを検証します
     * 
     * @param email
     * @param password
     * @return ログイン可能:true<br>ログイン不可:false
     * @throws NoSuchAlgorithmException
     */
    boolean LoginVerification(String email, String password) throws NoSuchAlgorithmException;
}
