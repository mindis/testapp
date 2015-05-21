package com.datatorrent.utils;

import java.util.Random;

public class ByteDataGenerator
{
  private int maxSize;
  private int minSize;
  private int sizeDiff;

  private Random random = new Random();

  protected ByteDataGenerator() { }

  public ByteDataGenerator(int max, int min) {
    maxSize = max;
    minSize = min;
    sizeDiff = max - min;
  }

  public byte[] generateData() {
    int size = (sizeDiff <= 0)? minSize : minSize + random.nextInt(sizeDiff);
    byte[] bytes = new byte[size];
    random.nextBytes(bytes);
    return bytes;
  }

}
