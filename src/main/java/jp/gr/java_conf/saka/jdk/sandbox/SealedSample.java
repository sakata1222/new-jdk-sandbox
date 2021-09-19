package jp.gr.java_conf.saka.jdk.sandbox;

import jp.gr.java_conf.saka.jdk.sandbox.SealedSample.Sub1;
import jp.gr.java_conf.saka.jdk.sandbox.SealedSample.Sub2;
import jp.gr.java_conf.saka.jdk.sandbox.SealedSample.Sub3;

public sealed interface SealedSample permits Sub1, Sub2, Sub3 {


  sealed class Sub1 implements SealedSample permits Sub1Sub {

  }

  non-sealed class Sub2 implements SealedSample {

  }

  final class Sub3 implements SealedSample {

  }

  final class Sub1Sub extends Sub1 {

  }

  @SuppressWarnings("unused")
      // we can extend Sub2 which is non-sealed
  class Sub2Sub extends Sub2 {

  }

  @SuppressWarnings("unused")
  class Sub2Sub2 extends Sub2 {

  }
}
