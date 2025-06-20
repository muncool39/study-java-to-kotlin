package com.lannstark.lec15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lec15JavaEx {

  public static void main(String[] args) {

    // (1) 배열
    int[] array = {100, 200};

    for(int i=0;i<array.length;i++) {
      System.out.printf("%s %s", i, array[i]);
    }

    // (2) Collection - List
    final List<Integer> nums = Arrays.asList(100, 200);
    // 하나 가져오기
    nums.get(0);
    // for each
    for (int n : nums) {
      System.out.println(n);
    }
    // 전통적인 for 문
    for(int i=0; i<nums.size(); i++) {
      System.out.println(i + nums.get(i));
    }

    // Collection - Map
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "A");
    map.put(2, "B");

    Map.of(1, "A", 2, "B");

    for(int k : map.keySet()) {
      System.out.println(k);
    }

    for(Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + entry.getValue());
    }


  }

}











