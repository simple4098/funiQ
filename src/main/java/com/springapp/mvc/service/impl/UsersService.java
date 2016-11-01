package com.springapp.mvc.service.impl;

import com.springapp.mvc.dao.IUsersDao;
import com.springapp.mvc.domain.Users;
import com.springapp.mvc.service.IUsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LinHuan on 14-4-30.
 */
  @Service
  @Transactional
public class UsersService implements IUsersService {
    @Resource
    private IUsersDao usersDao;
    @Override
    public Users getById(String id) {
        return usersDao.getById(id);
    }

    @Override
    public List<Users> selectAll() {
        return usersDao.selectAll();
    }

    @Override
    public void save(Users users) {
        usersDao.save(users);
    }
}
