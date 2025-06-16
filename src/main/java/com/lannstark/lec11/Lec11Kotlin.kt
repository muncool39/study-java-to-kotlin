package com.lannstark.lec11

/*
public      : 모든 곳
protected   : 선언된 클래스 또는 하위 클래스
internal    : 같은 모듈
private     : 선언된 클래스

패키지 관련 내용은 사라짐 (코틀린에서 패키지는 namespace 관리용)
 */


// 생성자에 접근 지시어를 붙이려면 constructor 을 붙여줘야 한다.
class Cat private constructor() {
}

// protected 는 하위 클래스와 본인 자신만 사용 가능
// => open 을 명시하지 않으면 final 이기 때문에 경고가 발생
open class Man protected constructor() {

}

/*
접근 제어-프로퍼티
 */
class Car(
    internal val name: String, // getter, setter 한번에 접근 제어
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set // setter 에만 추가로 가시성 부여
    // 기본은 public 이기 때문에 private 안붙인 getter 는 자동으로 public
}