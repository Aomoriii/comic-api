package xyz.bugboom.comicapi.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.bugboom.comicapi.entity.User;
import xyz.bugboom.comicapi.result.Result;
import xyz.bugboom.comicapi.mapper.UserMapper;
import xyz.bugboom.comicapi.entity.Login;
import xyz.bugboom.comicapi.vo.LoginVO;

import java.util.UUID;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public Result login(Login login){
        if (StringUtils.isNullOrEmpty(login.getLoginName())){
            return new Result(400, "账号不能为空","");
        }
        if (StringUtils.isNullOrEmpty(login.getPassword())){
            return new Result(400,"密码不能为空","");
        }
        // 通过登录查询用户
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name",login.getLoginName());
        User user = userMapper.selectOne(wrapper);
        // 密码验证
        if (user!=null && user.getUserPwd().equals(login.getPassword())){
//            return new Result(200,"",user);
            LoginVO loginVO = new LoginVO();
            loginVO.setId((user.getId()));
            loginVO.setToken(UUID.randomUUID().toString());
            loginVO.setUser(user);
            return new Result(200, "", loginVO);
        }
        return new Result(400,"登录失败","");
    }


}
