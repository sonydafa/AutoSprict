package com.easychat.entity.po;
import java.io.Serializable;
import lombok.Data;
@Data
public class ChatSession implements Serializable {
  private String id;
  private String lastMessage;
  private Integer lastRecevieTime;
}