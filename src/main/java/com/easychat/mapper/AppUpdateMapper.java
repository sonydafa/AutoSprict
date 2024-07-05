package com.easychat.mapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface AppUpdateMapper<T,P> extends BaseMapper<T,P> {
  T selectByid(Integer id);
  Integer updateByid(T t);
  Integer deleteByid(Integer id);
  T selectByversion(String version);
  Integer updateByversion(T t);
  Integer deleteByversion(String version);
}