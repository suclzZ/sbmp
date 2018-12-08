package com.sucl.sbmp.sys.service.impl;

import com.sucl.sbmp.sys.entity.User;
import com.sucl.sbmp.sys.mapper.UserMapper;
import com.sucl.sbmp.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sucl
 * @since 2018-12-08
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
