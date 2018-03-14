package com.logictech.service;

import com.logictech.entity.po.UserPO;

import java.util.List;

/**
 * @author JG.Hannibal
 * @since 2017/11/11 下午12:00
 */
public interface UserService {

    List<UserPO> listUser() throws Exception;

    Integer addUser(UserPO userDTO) throws Exception;

    Integer updateUser(UserPO userDTO) throws Exception;

    Integer removeUser(Integer id) throws Exception;

    void transactionalUser () throws Exception;
}
