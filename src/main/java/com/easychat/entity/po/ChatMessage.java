package com.easychat.entity.po;
import java.io.Serializable;
import lombok.Data;
@Data
public class ChatMessage implements Serializable {
  private Integer messageId;
  private String sessionId;
  private Integer messageType;
  private String messageContent;
  private String sendUserId;
  private String sendUserNickName;
  private Integer sendTime;
  private String contactId;
  private Integer contactType;
  private Integer fileSize;
  private String fileName;
  private Integer fileType;
  private Integer status;
}