package com.easychat.entity.query;
import java.util.Date;
import lombok.Data;
@Data
public class AppUpdateQuery {
  private Integer id;
  private String version;
  private String versionFuzzy;
  private String updateDesc;
  private String updateDescFuzzy;
  private Date createTime;
  private Date createTimeStart;
  private Date createTimeEnd;
  private Integer status;
  private String grayscaleUid;
  private String grayscaleUidFuzzy;
  private Integer fileType;
  private String outerLink;
  private String outerLinkFuzzy;
}