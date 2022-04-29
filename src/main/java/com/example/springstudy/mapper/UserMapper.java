package com.example.springstudy.mapper;

import com.example.springstudy.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author JunCheng
 * @since 2022-04-29
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
