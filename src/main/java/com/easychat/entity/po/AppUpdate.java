package com.easychat.entity.po;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
@Data
public class AppUpdate implements Serializable {
  private Integer id;
  private String version;
  private String updateDesc;
  private Date createTime;
  private Integer status;
  private String grayscaleUid;
  private Integer fileType;
  private String outerLink;
}