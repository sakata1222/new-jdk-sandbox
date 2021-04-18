package jp.gr.java_conf.saka.jdk.sandbox;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.Test;

class ToListTest {

  @Test
  void toList() {
    var toList = new ToList();
    List<Integer> result = toList.toList(1, 3, 4);
    assertThat(result).containsExactly(1, 3, 4);
  }

  @Test
  void toList_returns_unmodifiable_list() {
    var toList = new ToList();
    List<Integer> result = toList.toList(1, 3, 4);
    assertThatThrownBy(() -> result.add(10))
        .isInstanceOf(UnsupportedOperationException.class);
  }
}
