package jp.gr.java_conf.saka.jdk.sandbox;

public class TextBlockSample {

  String simpleTwoLine() {
    return """
        This is Line 1
        This is Line 2
        """;
  }

  String simpleTwoLineWithoutLastLf() {
    return """
        This is Line 1
        This is Line 2""";
  }

  String trailingSpacesAreIgnored() {
    return """
        This is Line 1    
        This is Line 2       
        """;
  }

  String linesWithTrailingSpace() {
    return """
        This is Line 1\s
        This is Line 2 \s
        This is Line 3\s\s
        """;
  }

  String format() {
    return """
        Hello %s
        """.formatted("World");
  }

}
