package com.easychat.entity.query;
import java.util.Date;
import lombok.Data;
@Data
public class GroupInfoQuery {
  private String groupId;
  private String groupIdFuzzy;
  private String groupName;
  private String groupNameFuzzy;
  private String groupOwnerId;
  private String groupOwnerIdFuzzy;
  private Date createTime;
  private Date createTimeStart;
  private Date createTimeEnd;
  private String groupNotice;
  private String groupNoticeFuzzy;
  private Integer joinType;
  private Integer status;
}