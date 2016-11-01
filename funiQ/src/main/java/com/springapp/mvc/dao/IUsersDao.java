package com.springapp.mvc.dao;


import com.springapp.mvc.domain.Users;

import java.util.List;

/**
 * Created by LinHuan on 14-4-30.
 */
public interface IUsersDao {
    public Users getById(String id);
    public List<Users> selectAll();
    public void save(Users users);
}
