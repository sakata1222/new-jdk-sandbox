package jp.gr.java_conf.saka.jdk.sandbox;

record Range(int min, int max) {

  Range {
    if (min > max) {
      throw new IllegalArgumentException(
          "min(" + min + ") should be equal or less than max(" + max + ")");
    }
  }

  public boolean isInRange(int x) {
    return (min <= x && x <= max);
  }
}
