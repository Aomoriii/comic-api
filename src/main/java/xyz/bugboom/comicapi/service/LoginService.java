package xyz.bugboom.comicapi.service;

import xyz.bugboom.comicapi.result.Result;
import xyz.bugboom.comicapi.entity.Login;

/**
 * 登录业务接口
 */
public interface LoginService {
     Result login(Login login);
}
