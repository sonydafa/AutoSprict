package com.easychat.mapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserInfoMapper<T,P> extends BaseMapper<T,P> {
  T selectByemail(String email);
  Integer updateByemail(T t);
  Integer deleteByemail(String email);
  T selectByid(String id);
  Integer updateByid(T t);
  Integer deleteByid(String id);
}