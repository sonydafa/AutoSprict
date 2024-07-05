package com.easychat.entity.query;
import lombok.Data;
@Data
public class ChatMessageQuery {
  private Integer messageId;
  private String sessionId;
  private String sessionIdFuzzy;
  private Integer messageType;
  private String messageContent;
  private String messageContentFuzzy;
  private String sendUserId;
  private String sendUserIdFuzzy;
  private String sendUserNickName;
  private String sendUserNickNameFuzzy;
  private Integer sendTime;
  private String contactId;
  private String contactIdFuzzy;
  private Integer contactType;
  private Integer fileSize;
  private String fileName;
  private String fileNameFuzzy;
  private Integer fileType;
  private Integer status;
}