package com.bluesgao.findingpet.service.impl;

import com.bluesgao.findingpet.mapper.UserMapper;
import com.bluesgao.findingpet.service.IUserService;
import com.bluesgao.findingpet.entity.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bluesgao
 * @since 2018-11-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
