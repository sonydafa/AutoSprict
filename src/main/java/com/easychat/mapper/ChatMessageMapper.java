package com.easychat.mapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface ChatMessageMapper<T,P> extends BaseMapper<T,P> {
  T selectBymessageId(Integer messageId);
  Integer updateBymessageId(T t);
  Integer deleteBymessageId(Integer messageId);
}