package jp.gr.java_conf.saka.jdk.sandbox;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import java.util.stream.Stream;
import jp.gr.java_conf.saka.jdk.sandbox.ImprovedSwitch.Day;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class SwitchExpressionTest {

  private static final String DAY_OFF = "Day off :)";
  private static final String WORKING = "Working..";

  private static final Map<Day, String> TEST_CASE = Map.ofEntries(
      Map.entry(Day.SUNDAY, DAY_OFF),
      Map.entry(Day.MONDAY, WORKING),
      Map.entry(Day.TUESDAY, WORKING),
      Map.entry(Day.WEDNESDAY, WORKING),
      Map.entry(Day.THURSDAY, WORKING),
      Map.entry(Day.FRIDAY, WORKING),
      Map.entry(Day.SATURDAY, DAY_OFF)
  );

  private ImprovedSwitch switchExpression = new ImprovedSwitch();

  @TestFactory
  Stream<DynamicTest> switchExpression() {
    return TEST_CASE.entrySet().stream()
        .map(e ->
            DynamicTest.dynamicTest(
                String.valueOf(e),
                () -> assertThat(switchExpression.switchExpression(e.getKey()))
                    .isEqualTo(e.getValue())
            ));
  }

  @TestFactory
  Stream<DynamicTest> switchExpressionWithYield() {
    return TEST_CASE.entrySet().stream()
        .map(e ->
            DynamicTest.dynamicTest(
                String.valueOf(e),
                () -> assertThat(switchExpression.switchExpressionWithYield(e.getKey()))
                    .isEqualTo(e.getValue())
            ));
  }

  @TestFactory
  Stream<DynamicTest> switchArrow() {
    return TEST_CASE.entrySet().stream()
        .map(e ->
            DynamicTest.dynamicTest(
                String.valueOf(e),
                () -> assertThat(switchExpression.switchArrow(e.getKey()))
                    .isEqualTo(e.getValue())
            ));
  }

}
