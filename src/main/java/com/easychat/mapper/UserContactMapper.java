package com.easychat.mapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserContactMapper<T,P> extends BaseMapper<T,P> {
  T selectBycontactId(String contactId);
  Integer updateBycontactId(T t);
  Integer deleteBycontactId(String contactId);
  T selectBy();
  Integer updateBy(T t);
  Integer deleteBy();
}