package com.easychat.entity.po;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
@Data
public class UserInfo implements Serializable {
  private String id;
  private String email;
  private String nickName;
  private Integer joinType;
  private Integer sex;
  private String password;
  private String personalSignature;
  private Integer status;
  private Date createTime;
  private Date lastLoginTime;
  private String areaName;
  private String areaCode;
  private Date lastOffTime;
}