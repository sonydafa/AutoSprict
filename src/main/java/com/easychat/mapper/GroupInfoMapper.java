package com.easychat.mapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface GroupInfoMapper<T,P> extends BaseMapper<T,P> {
  T selectBygroupId(String groupId);
  Integer updateBygroupId(T t);
  Integer deleteBygroupId(String groupId);
}