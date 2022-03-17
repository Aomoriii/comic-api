package xyz.bugboom.comicapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName(value = "Users")
@Data
public class User {

    @TableId(type = IdType.AUTO)
    private int id;
    private String userName;
    private String userPwd;
    private String subscribes;


}
