package com.lannstark.lec12;

public class Lec12JavaEx {

  public static void main(String[] args) {
    KotlinPerson.Factory.newBaby("이름");
    // 이름이 안붙여져 있다면 (기본 이름은: Companion) -> KotlinPerson.Companion.newBaby("ABC");
    KotlinPerson.newBaby("어노테이션 붙여야 바로 접근 가능");

    // 익명 클래스: new+구현해서 인테페이스 만들어 넘김 (익명 클래스로 만들어 인자로 던짐)
    moveSomething(new Movable() {
      @Override
      public void move() {
        System.out.println("움직임");
      }

      @Override
      public void fly() {
        System.out.println("남");
      }
    });

  }

  private static void moveSomething(Movable movable) {
    movable.move();
    movable.fly();
  }

}
