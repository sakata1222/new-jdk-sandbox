package jp.gr.java_conf.saka.jdk.sandbox;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RangeTest {

  @ParameterizedTest
  @CsvSource({
      "1, false",
      "2, true",
      "3, true",
      "4, true",
      "5, true",
      "6, false"
  })
  void isInRange(int x, boolean expected) {
    Range r = new Range(2, 5);
    assertThat(r.isInRange(x)).isEqualTo(expected);
  }

  @Test
  void constructor_throws_Exception() {
    assertThatThrownBy(() -> new Range(2, 1))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("min(2) should be equal or less than max(1)");
  }
}
