package jp.gr.java_conf.saka.jdk.sandbox;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TextBlockSampleTest {

  private final TextBlockSample target = new TextBlockSample();

  @Test
  void simpleTwoLine() {
    assertThat(
        target.simpleTwoLine()
    ).isEqualTo(
        "This is Line 1\n"
            + "This is Line 2\n"
    );
  }

  @Test
  void simpleTwoLineWithoutLastLf() {
    assertThat(
        target.simpleTwoLineWithoutLastLf()
    ).isEqualTo(
        "This is Line 1\n"
            + "This is Line 2"
    );
  }

  @Test
  void trailingSpacesAreIgnored() {
    assertThat(
        target.trailingSpacesAreIgnored()
    ).isEqualTo(
        "This is Line 1\n"
            + "This is Line 2\n"
    );
  }

  @Test
  void linesWithTrailingSpace() {
    assertThat(
        target.linesWithTrailingSpace()
    ).isEqualTo(
        "This is Line 1 \n"
            + "This is Line 2  \n"
            + "This is Line 3  \n"
    );
  }

  @Test
  void format() {
    assertThat(
        target.format()
    ).isEqualTo(
        "Hello World\n"
    );
  }

}
