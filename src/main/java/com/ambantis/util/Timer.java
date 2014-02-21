package com.ambantis.util;

public class Timer {
  private final long start;

  public Timer() {
    start = System.currentTimeMillis();
  }

  public long elapsedTime() {
    return System.currentTimeMillis() - start;
  }
}
