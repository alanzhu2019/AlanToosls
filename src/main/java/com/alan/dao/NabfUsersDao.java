package com.alan.dao;

import com.alan.bean.Nabfusers;

import java.util.List;

public interface NabfUsersDao {

     List<Nabfusers> gitUser(String userId);

     boolean addUser(Nabfusers user);

     List<Nabfusers> gitUsers200();


}
