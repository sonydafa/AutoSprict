package com.easychat.entity.po;
import java.io.Serializable;
import lombok.Data;
@Data
public class UserInfoBeauty implements Serializable {
  private Integer id;
  private String userId;
  private String email;
  private Integer status;
}