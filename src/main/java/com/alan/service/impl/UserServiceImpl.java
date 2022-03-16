package com.alan.service.impl;

import com.alan.bean.Nabfusers;
import com.alan.dao.NabfUserDao;
import com.alan.service.UserService;
import com.alan.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserServiceImpl implements UserService {



    @Override
    public List<Nabfusers> gitUserInfo(String userId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        NabfUserDao userMapper = sqlSession.getMapper(NabfUserDao.class);
        if (userId != null){
            return userMapper.gitUser(userId);
        }
        return null;
    }
}
