package com.user.Dao;

import com.user.bean.UserBean;

public interface UserDao {
int register(UserBean ub);
boolean verifyuser(String username,String password);
}
