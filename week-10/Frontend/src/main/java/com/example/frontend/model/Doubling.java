package com.example.frontend.model;

public class Doubling {

  private Integer input;
  private Integer result;

  public Doubling(){
  }

  public Doubling(Integer input) {
    this.input = input;
    this.result = 2 * input;
  }

  public Integer getInput() {
    return input;
  }

  public void setInput(Integer input) {
    this.input = input;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
