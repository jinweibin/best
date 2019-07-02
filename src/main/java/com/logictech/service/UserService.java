package com.logictech.service;

import com.logictech.entity.po.UserPO;

import java.util.List;

/**
 * @author JG.Hannibal
 * @since 2017/11/11 下午12:00
 */
public interface UserService {

    /**
     * 列表
     * @return
     * @throws Exception
     */
    List<UserPO> listUser() throws Exception;

    /**
     * 新增
     * @param userDTO
     * @return
     * @throws Exception
     */
    Integer addUser(UserPO userDTO) throws Exception;

    /**
     * 更新
     * @param userDTO
     * @return
     * @throws Exception
     */
    Integer updateUser(UserPO userDTO) throws Exception;

    /**
     * 移除
     * @param id
     * @return
     * @throws Exception
     */
    Integer removeUser(Integer id) throws Exception;

    /**
     * 回滚测试
     * @throws Exception
     */
    void transactionalUser () throws Exception;
}
