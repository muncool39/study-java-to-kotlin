package com.lannstark.lec04;

public class Lec04JavaEx {

  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(1_000L);
    JavaMoney money2 = new JavaMoney(2_000L);

    // (1) 객체간의 비교 Java -> compareTo
    if(money1.compareTo(money2) > 0) {
      System.out.println("머니1이 머니2보다 금액이 큽니다.");
    }

    JavaMoney money3 = new JavaMoney(1_000L);
    JavaMoney money4 = money1;

    // (2) 동일성(값) equals, 동등성(주소) ==
    System.out.println(money1 == money3);       // false
    System.out.println(money1 == money4);       // true
    System.out.println(money1.equals(money3));  // true
    System.out.println(money1.equals(money4));  // ture

    // (3) plus 연산
    System.out.println(money1.plus(money2));
  }

}
