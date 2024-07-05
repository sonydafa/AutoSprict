package com.easychat.entity.query;
import java.util.Date;
import lombok.Data;
@Data
public class UserContactApplyQuery {
  private Integer applyId;
  private String applyUserId;
  private String applyUserIdFuzzy;
  private String receiveUserId;
  private String receiveUserIdFuzzy;
  private String contactId;
  private String contactIdFuzzy;
  private Integer contactType;
  private Date createTime;
  private Date createTimeStart;
  private Date createTimeEnd;
  private Integer status;
  private Integer lastApplyTime;
  private String applyInfo;
  private String applyInfoFuzzy;
}