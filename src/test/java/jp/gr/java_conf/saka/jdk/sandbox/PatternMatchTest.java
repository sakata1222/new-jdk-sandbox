package jp.gr.java_conf.saka.jdk.sandbox;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import com.google.common.collect.ImmutableMap;
import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class PatternMatchTest {

  @TestFactory
  Stream<DynamicTest> to64bit() {
    PatternMatch p = new PatternMatch();
    return ImmutableMap.<Number, Class>builder()
        .put(1, Long.class)
        .put(1L, Long.class)
        .put(1f, Double.class)
        .put(1d, Double.class)
        .build().entrySet().stream().map(
            entry -> dynamicTest(
                entry.getKey().getClass() + " should be converted to " + entry.getValue(),
                () -> Assertions.assertThat(p.to64bit(entry.getKey()))
                    .isExactlyInstanceOf(entry.getValue())
            ));
  }
}
