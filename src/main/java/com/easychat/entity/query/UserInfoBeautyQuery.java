package com.easychat.entity.query;
import lombok.Data;
@Data
public class UserInfoBeautyQuery {
  private Integer id;
  private String userId;
  private String userIdFuzzy;
  private String email;
  private String emailFuzzy;
  private Integer status;
}