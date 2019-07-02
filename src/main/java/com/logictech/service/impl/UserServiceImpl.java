package com.logictech.service.impl;

import com.logictech.entity.po.UserPO;
import com.logictech.entity.so.AppException;
import com.logictech.mapper.UserMapper;
import com.logictech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static com.logictech.config.MessageConfig.get;

/**
 * @author JG.Hannibal
 * @since 2017/11/11 下午12:14
 */
@Service
@Transactional(rollbackFor = AppException.class)
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 列表
     * @return
     * @throws Exception
     */
    @Override
    public List<UserPO> listUser() throws Exception {
        return userMapper.selectAll();
    }

    /**
     * 新增
     * @param userDTO
     * @return
     * @throws Exception
     */
    @Override
    public Integer addUser(UserPO userDTO) throws Exception {
        return userMapper.mInsert(userDTO);
    }

    /**
     * 更新
     * @param userDTO
     * @return
     * @throws Exception
     */
    @Override
    public Integer updateUser(UserPO userDTO) throws Exception {
        Integer update = userMapper.updateByPrimaryKey(userDTO);
        if (update > 0) {
            return update;
        } else {
            throw new AppException(get("EM0002"));
        }
    }

    /**
     * 移除
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Integer removeUser(Integer id) throws Exception {
        if (userMapper.deleteByPrimaryKey(id) > 0) {
            return 1;
        } else {
            throw new AppException(get("EM0003"));
        }
    }

    /**
     * 回滚测试
     * @throws Exception
     */
    @Override
    public void transactionalUser() throws Exception {
        UserPO user = new UserPO();
        user.setUsername("J.G.Hannibal");
        user.setPassword("123456");
        user.setUserType("1");
        user.setEnabled(1);
        user.setRealName("jinweibin");
        user.setQq("10000");
        user.setEmail("132456@qq.com");
        user.setTel("110");
        user.setCityId(1);
        userMapper.insert(user);
        throw new AppException(get("EM0001"));
    }
}
    