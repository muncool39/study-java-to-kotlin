package com.lannstark.lec13;

public class JavaHouse {

  private String address;
  private LivingRoom livingRoom;

  public JavaHouse(String address) {
    this.address = address;
    this.livingRoom = new LivingRoom(10);
  }

  public LivingRoom getLivingRoom() {
    return livingRoom;
  }

  // 중첩 클래스
  public static class LivingRoom {
    private double area;

    public LivingRoom(double area) {
      this.area = area;
    }
  }

  /*
  내부 클래스
  바깥 클래스와 연결되어 있음 = 내부 클래스가 외부 클래스를 참조한다.
  static class 라면 바깥 클래스를 바로 불러올 수 없다.
    = 클래스 안에 클래스를 만들 때는 static 클래스를 사용하라 (권장) = 중첩 클래스
   */
  public class LivingRoom2 {
    private double area;
    // 외부 클래스 참조
    public String getAddress() {
      return JavaHouse.this.address;
    }
  }

}