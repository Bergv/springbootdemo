package com.botech.mapper;

import com.botech.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    //@Select("SELECT ID AS id, USERNAME AS username, PASSWORD AS password FROM \"USER\";")
    @Select("SELECT * FROM \"USER\";")
    List<User> findAllUser();
}
