package jp.gr.java_conf.saka.jdk.sandbox;

public class ImprovedSwitch {

  String switchExpression(Day day) {
    return switch (day) {
      case SUNDAY, SATURDAY -> "Day off :)";
      case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working..";
      // we do not need default :)
    };
  }

  String switchExpressionWithYield(Day day) {
    return switch (day) {
      case SUNDAY, SATURDAY -> {
        System.out.println("We can write a code block");
        yield "Day off :)";
      }
      case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working..";
    };
  }

  String switchArrow(Day day) {
    String ans;
    switch (day) {
      case SUNDAY, SATURDAY -> {
        ans = "Day off :)";
        System.out.println("We do not need break :)");
      }
      case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> ans = "Working..";
      default -> ans = "An compile error occurs without default.. :"
          + " Variable 'ans' might not have been initialized";
    }
    return ans;
  }


  public enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
  }
}
