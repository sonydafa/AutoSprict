package com.easychat.entity.query;
import java.util.Date;
import lombok.Data;
@Data
public class UserInfoQuery {
  private String id;
  private String idFuzzy;
  private String email;
  private String emailFuzzy;
  private String nickName;
  private String nickNameFuzzy;
  private Integer joinType;
  private Integer sex;
  private String password;
  private String passwordFuzzy;
  private String personalSignature;
  private String personalSignatureFuzzy;
  private Integer status;
  private Date createTime;
  private Date createTimeStart;
  private Date createTimeEnd;
  private Date lastLoginTime;
  private Date lastLoginTimeStart;
  private Date lastLoginTimeEnd;
  private String areaName;
  private String areaNameFuzzy;
  private String areaCode;
  private String areaCodeFuzzy;
  private Date lastOffTime;
  private Date lastOffTimeStart;
  private Date lastOffTimeEnd;
}