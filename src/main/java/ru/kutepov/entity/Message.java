package ru.kutepov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "MESSAGE")
public class Message {

  @Id
  @Column(name = "ID")
  private Integer id;

  @Column(name="USER_ID")
  private Integer userId;

  @Column(name="TITLE")
  private String title;

  @Column(name="BODY")
  private String body;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public String toString() {
    return "Message{" +
        "id=" + id +
        ", userId=" + userId +
        ", title='" + title + '\'' +
        ", body='" + body + '\'' +
        '}';
  }

}
