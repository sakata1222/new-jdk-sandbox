package jp.gr.java_conf.saka.jdk.sandbox;

import java.util.List;
import java.util.stream.Stream;

public class ToList {

  @SuppressWarnings({"unchecked", "varargs"})
  <T> List<T> toList(T... values) {
    return Stream.of(values).toList();
  }
}
