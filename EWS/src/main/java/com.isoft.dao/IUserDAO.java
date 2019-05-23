package com.isoft.dao;

import java.util.List;
import java.util.Map;

public interface IUserDAO {
    String login(String uname,String upwd) throws Exception;
    boolean register(String uname,String upwd,String email);
    List<Map<String,Object>> findAllUser(int page, int pageSize);
    List<Map<String,Object>> userTotal();
    Map<String,Object> findUserCount();
    int deleteUserInfoById(int id);

}
