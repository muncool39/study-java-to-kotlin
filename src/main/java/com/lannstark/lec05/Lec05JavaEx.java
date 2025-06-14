package com.lannstark.lec05;

public class Lec05JavaEx {

  public static void main(String[] args) {
  }

  private void validateScoreIsNotNegative(int score) {
    if (score < 0) {
      throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.", score));
    }
  }

  private String getPassOrFail(int score) {
    return score >= 50 ? "P" : "F";
  }

  private void validate(int score) {
    if (0<= score && score <= 100) {
      System.out.println("범위 내에 존재합니다.");
    }
  }

  private String getGradeWithSwitch(int score) {
    switch (score/10) {
      case 9:
        return "A";
      case 8:
        return "B";
      case 7:
        return "C";
      default:
        return "D";
    }
  }

  private void judgeNumber1(int number) {
    if(number == 1 || number == 0 || number == -1) {
      System.out.println("많이 본 숫자입니다.");
    } else {
      System.out.println("1, 0, -1이 아닙니다.");
    }
  }

  private void judgeNumber2(int number) {
    if (number == 0) {
      System.out.println("주어진 숫자는 0입니다");
      return;
    }

    if (number % 2 == 0) {
      System.out.println("주어진 숫자는 짝수입니다");
      return;
    }

    System.out.println("주어지는 숫자는 홀수입니다");
  }

}
