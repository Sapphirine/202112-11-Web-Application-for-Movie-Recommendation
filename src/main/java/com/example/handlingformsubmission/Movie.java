package com.example.handlingformsubmission;

public class Movie {

  private long id;
  private String name;
  private String content;
  private String weblink;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
  
  public String getName() {
	return name;
  }

  public void setName(String name) {
	  this.name = name;
  }
  
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
  
  public String getWeblink() {
	return weblink;
  }

  public void setWeblink(String weblink) {
	 this.weblink = weblink;
  }
  
}