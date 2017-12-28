package com.example.demo3.mapper;

import com.example.demo3.entity.UserBase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select UB_ID_N as ubIdN,UB_NICK_NAME_V as ubNickNameV,UB_NAME_V as ubNameV, UB_MP_V as ubMpV, UB_LEVEL_C as ubLevelC from user_base ")
    List<UserBase> queryUserList();
}
