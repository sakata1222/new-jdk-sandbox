package jp.gr.java_conf.saka.jdk.sandbox;

public class PatternMatch {

  Number to64bit(Number n) {
    if (n instanceof Integer i) {
      return i.longValue();
    }
    if (n instanceof Long l) {
      return l;
    }
    // compile error
    // Inconvertible types; cannot cast 'java.lang.Number' to 'java.lang.String'
    /*
    if (n instanceof String s) {
    }
    */
    return n.doubleValue();
  }
}
