package com.easychat.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseMapper<T,P> {
  Integer insert(@Param("bean") T t);
  Integer insertBatch(@Param("list") List<T> list);
  Integer insertOrUpdateBatch(@Param("list") List<T> list);
  Integer insertOrUpdate(@Param("bean") T t);
  List<T> selectList(@Param("query") P p);
  Integer selectCount(@Param("query") P p);

}
