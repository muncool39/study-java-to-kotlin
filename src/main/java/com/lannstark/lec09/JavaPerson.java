package com.lannstark.lec09;

/*
개명이 불가능한 Person 클래스
 */
public class JavaPerson {

  private final String name;
  private int age;

  public JavaPerson(String name, int age) {
    // (2) 생성자와 init ex)생성되는 시점에 나이 검증하기
    if (age <= 0) {
      throw new IllegalArgumentException(String.format("나이는 %s일 수 없습니다", age));
    }
    this.name = name;
    this.age = age;
  }
  // (2) 생성자 추가하기
  public JavaPerson(String name) {
    this(name, 1);
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // (3) 커스텀 getter setter
  public boolean isAdult() {
    return this.age >= 20;
  }

}

