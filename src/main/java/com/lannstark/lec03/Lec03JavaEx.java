package com.lannstark.lec03;

public class Lec03JavaEx {

  public static void main(String[] args) {

    // (1) String 출력
    Person person = new Person("문시원", 23);
    System.out.printf("이름 %s", person.getName());

    // (2) 문자열에서 문자 가져오기
    String abc = "ABC";
    System.out.println(abc.charAt(0));

  }

  public static void printAgeIfPerson(Object obj) {
    /*
    instanceof: 변수가 주어진 타입이면 true, 아니라면 false
     */
    if (obj instanceof Person) {
      Person person = (Person) obj;
      System.out.println(person.getAge());
    }
  }

}
