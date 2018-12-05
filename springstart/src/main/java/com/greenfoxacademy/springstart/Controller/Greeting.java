package com.greenfoxacademy.springstart.Controller;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  static long counter;
  String content;
  static AtomicLong atomicLong = new AtomicLong(1);

  public Greeting(String content) {
    this.counter = atomicLong.getAndIncrement();
    this.content = content;
  }

  public long getCounter() {
    return counter;
  }

  public String getContent() {
    return content;
  }
}
