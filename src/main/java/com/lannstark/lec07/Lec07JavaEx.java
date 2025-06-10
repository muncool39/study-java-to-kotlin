package com.lannstark.lec07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

public class Lec07JavaEx {

  public static void main(String[] args) throws IOException {

  }

  // (1) try catch finally 구문

  private int parseIntOrThrow(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("숫자가 아닙니다.");
    }
  }

  private Integer parseIntOrThrowV2(@NotNull String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      return null;
    }
  }

  // (2) CheckedException 과 UncheckedException ex)파일 읽기

  private void readFile() throws IOException { // 반드시 예외가 발생할 수 있다는 표시
    File currentFile = new File(".");
    File file = new File(currentFile.getAbsolutePath() + "/a.txt");
    BufferedReader reader = new BufferedReader(new FileReader(file));
    System.out.println(reader.readLine());
    reader.close();
  }

  // (3) try with resources ex)프로젝트 내 파일 내용물 읽어오기
/*
try with resources: try (외부 자원 생성) -> 끝나면 자동으로 외부 자원 닫는 구문
 */
  private void readFileV2(String path) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      System.out.println(reader.readLine());
    }
  }
}















