package xyz.bugboom.comicapi.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 登录实体类
 */

public class Login {
    //用户名
    private String loginName;
    //密码
    private String password;

    public String getLoginName() {
        return loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
