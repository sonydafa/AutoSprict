package com.easychat.mapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface ChatSessionMapper<T,P> extends BaseMapper<T,P> {
  T selectByid(String id);
  Integer updateByid(T t);
  Integer deleteByid(String id);
}