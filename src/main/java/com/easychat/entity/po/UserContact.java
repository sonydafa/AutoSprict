package com.easychat.entity.po;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
@Data
public class UserContact implements Serializable {
  private String userId;
  private String contactId;
  private Integer contactType;
  private Date createTime;
  private Integer status;
  private Date lastUpdateTime;
}