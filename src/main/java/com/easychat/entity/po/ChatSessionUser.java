package com.easychat.entity.po;
import java.io.Serializable;
import lombok.Data;
@Data
public class ChatSessionUser implements Serializable {
  private String userId;
  private String contactId;
  private String sessionId;
  private String contactName;
}