package com.easychat.entity.query;
import java.util.Date;
import lombok.Data;
@Data
public class UserContactQuery {
  private String userId;
  private String userIdFuzzy;
  private String contactId;
  private String contactIdFuzzy;
  private Integer contactType;
  private Date createTime;
  private Date createTimeStart;
  private Date createTimeEnd;
  private Integer status;
  private Date lastUpdateTime;
  private Date lastUpdateTimeStart;
  private Date lastUpdateTimeEnd;
}