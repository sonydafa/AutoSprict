package com.easychat.entity.query;
import lombok.Data;
@Data
public class ChatSessionUserQuery {
  private String userId;
  private String userIdFuzzy;
  private String contactId;
  private String contactIdFuzzy;
  private String sessionId;
  private String sessionIdFuzzy;
  private String contactName;
  private String contactNameFuzzy;
}