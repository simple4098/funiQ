package com.springapp.mvc.dao.impl;
import com.springapp.mvc.dao.IUsersDao;
import com.springapp.mvc.domain.Users;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;



@Repository
public class UsersDao implements IUsersDao,InitializingBean{
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    public final static String NAMESPACE="com.springapp.mvc.dao.IUsersDao." ;
    @Override
    public Users getById(String id) {

        return sqlSession.selectOne(NAMESPACE+"findById",id);
    }

    @Override
    public List<Users> selectAll() {
        return sqlSession.selectList(NAMESPACE+"select");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
       sqlSession=sqlSessionFactory.openSession();
    }

    @Override
    public void save(Users users) {
        sqlSession.insert(NAMESPACE+"save",users);
    }
}
