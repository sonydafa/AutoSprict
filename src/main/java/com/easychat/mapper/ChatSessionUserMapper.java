package com.easychat.mapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface ChatSessionUserMapper<T,P> extends BaseMapper<T,P> {
  T selectBy();
  Integer updateBy(T t);
  Integer deleteBy();
}