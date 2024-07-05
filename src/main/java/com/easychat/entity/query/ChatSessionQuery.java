package com.easychat.entity.query;
import lombok.Data;
@Data
public class ChatSessionQuery {
  private String id;
  private String idFuzzy;
  private String lastMessage;
  private String lastMessageFuzzy;
  private Integer lastRecevieTime;
}