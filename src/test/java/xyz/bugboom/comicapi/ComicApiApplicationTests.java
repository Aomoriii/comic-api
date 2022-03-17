package xyz.bugboom.comicapi;

import org.junit.runner.RunWith;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.bugboom.comicapi.entity.User;
import xyz.bugboom.comicapi.mapper.UserMapper;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ComicApiApplicationTests {

    @Autowired(required = false)
    UserMapper userMapper;

    @Test
    @DisplayName("findall")
    public void testSelect(){
        List<User> userList = userMapper.selectList(null);
        for (User user : userList){
            System.out.println(user);
        }


    }

}
