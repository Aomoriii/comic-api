package xyz.bugboom.comicapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.bugboom.comicapi.result.Result;
import xyz.bugboom.comicapi.entity.Login;
import xyz.bugboom.comicapi.service.LoginService;

/**
 * 登录控制业务
 */
@RestController
public class LoginController {

    @Autowired(required = false)
    LoginService loginservice;

    @PostMapping(value = "/api/login")
    @CrossOrigin    //后端跨域
    public Result login(@RequestBody Login login){
        return loginservice.login(login);
    }
}
