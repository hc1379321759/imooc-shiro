package com.shiro.dao;


import com.shiro.vo.User;

import java.util.List;

public interface UserDao {

    User getUserByUserName(String userName);

    List<String> getRoleByUserName(String userName);

    List<String> getPermByUserName(String userName);
}
