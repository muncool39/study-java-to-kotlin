package com.lannstark.lec02;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {

  private final String name;

  public Person(String name) {
    this.name = name;
  }

  //@Nullable
  @NotNull // Java <-> Kotlin 같이 사용할 때 Kotlin 이 어노테이션을 인식한다.
  public String getName() {
    return name;
  }

}


