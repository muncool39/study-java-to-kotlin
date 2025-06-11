package com.lannstark.lec08;

public class Lec08JavaEx {

  public static void main(String[] args) {
    // (4)
    String[] arr = new String[]{"A", "B", "C"};
    printAll(arr);
    printAll("A", "B", "C");
  }

  // (1) 함수 선언
  public int max(int a, int b) {
      return a > b ? a : b;
  }

  // (2) default parameter (자바에는 X)
  public void repeat(String str, int num, boolean useNewLine) {
    for(int i=1;i<=num;i++) {
      if(useNewLine) {
        System.out.println(str);
      } else {
        System.out.print(str);
      }
    }
  }
  // overloading 1
  public void repeat(String str, int num) {
    repeat(str, num, true);
  }
  // overloading 2
  public void repeat(String str) {
    repeat(str, 3, true);
  }

  // (4) 같은 타입의 여러 파라미터 받기 (가변 인자) ex)문자열을 N개 받아 출력
  public static void printAll(String... strings) {
    for (String str : strings) {
      System.out.println(str);
    }
  }

}










