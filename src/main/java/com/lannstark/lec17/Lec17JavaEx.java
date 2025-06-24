package com.lannstark.lec17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lec17JavaEx {

  public static void main(String[] args) {
    List<Fruit> fruits = Arrays.asList(
        new Fruit("사과", 1_000),
        new Fruit("사과", 1_200),
        new Fruit("사과", 1_200),
        new Fruit("사과", 1_500),
        new Fruit("바나나", 3_000),
        new Fruit("바나나", 3_200),
        new Fruit("바나나", 2_500),
        new Fruit("수박", 10_000)
    );
    // 람다 등장
    List<Fruit> apples = filterFruits(fruits, fruit -> fruit.getName().equals("사과"));
    List<Fruit> applesMe = filterFruits(fruits, Fruit::isApple);  // 메소드 레퍼런스 사용 가능
    /*
    Java 에서 함수 <- 변수에 할당되거나 파라미터로 전달할 수 없음
     */

    // Closure
    String targetName = "바나나";
    targetName = "수박";
    // targetName 을 사용할 수 없다. Java 에서는 람다를 쓸 때 사용할 수 있는 변수에 제약 있음
    // List<Fruit> tt = filterFruits(fruits, fruit -> targetName.getName().equals("사과"));
  }

  private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> fruitFilter) {
    // stream 등장
    return fruits.stream()
            .filter(fruitFilter)
            .collect(Collectors.toList());
    /*
    List<Fruit> results = new ArrayList<>();
    for (Fruit fruit : fruits) {
      if (fruitFilter.test(fruit)) {
        results.add(fruit);
      }
    }
    return results;
     */
  }

}
