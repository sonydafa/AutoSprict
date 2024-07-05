package com.easychat.entity.po;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
@Data
public class GroupInfo implements Serializable {
  private String groupId;
  private String groupName;
  private String groupOwnerId;
  private Date createTime;
  private String groupNotice;
  private Integer joinType;
  private Integer status;
}