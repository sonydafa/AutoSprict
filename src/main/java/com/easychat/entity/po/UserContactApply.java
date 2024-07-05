package com.easychat.entity.po;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
@Data
public class UserContactApply implements Serializable {
  private Integer applyId;
  private String applyUserId;
  private String receiveUserId;
  private String contactId;
  private Integer contactType;
  private Date createTime;
  private Integer status;
  private Integer lastApplyTime;
  private String applyInfo;
}