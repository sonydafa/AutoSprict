package com.easychat.mapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserInfoBeautyMapper<T,P> extends BaseMapper<T,P> {
  T selectByemail(String email);
  Integer updateByemail(T t);
  Integer deleteByemail(String email);
  T selectByuserId(String userId);
  Integer updateByuserId(T t);
  Integer deleteByuserId(String userId);
  T selectByid(Integer id);
  Integer updateByid(T t);
  Integer deleteByid(Integer id);
  T selectByuserId(String userId);
  Integer updateByuserId(T t);
  Integer deleteByuserId(String userId);
}