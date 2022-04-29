package com.example.springstudy.service.impl;

import com.example.springstudy.domain.User;
import com.example.springstudy.mapper.UserMapper;
import com.example.springstudy.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JunCheng
 * @since 2022-04-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
