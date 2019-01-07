package com.example.frontend.model;

public class AppendA {

  private String appended;

  public AppendA(){
  }

  public AppendA(String appendable) {
    this.appended = appendable.concat("a");
  }

  public String getAppendA() {
    return appended;
  }

  public void setAppendA(String appended) {
    this.appended = appended;
  }
}
