package com.easychat.mapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserContactApplyMapper<T,P> extends BaseMapper<T,P> {
  T selectBy();
  Integer updateBy(T t);
  Integer deleteBy();
  T selectBylastApplyTime(Integer lastApplyTime);
  Integer updateBylastApplyTime(T t);
  Integer deleteBylastApplyTime(Integer lastApplyTime);
  T selectByapplyId(Integer applyId);
  Integer updateByapplyId(T t);
  Integer deleteByapplyId(Integer applyId);
}