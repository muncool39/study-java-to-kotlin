package com.lannstark.lec14


fun handleS(alp: SClass) {
    when (alp) {
        is SClass.A -> TODO()
        is SClass.B -> TODO()
        is SClass.C -> TODO()
    }
}

/*
상속이 가능하도록 추상클래스를 만들고 싶지만 외부에서는 상속받지 않았으면 할 때
-> 하위 클래스를 봉인

컴파일 때 하위 클래스의 타입을 모두 기억 = 런타임때 클래스 타입 추가 불가능
-> Enum 과 동일하게 when 사용시 강점을 가짐
-> 추상화가 필요한 Entity or DTO 에 활용할 수 있다.
하위 클래스는 같은 패키지에 있어야 함

JDK17 에도 추가되었다고 합니다.
 */
sealed class SClass (
    val name: String,
    val price: Long
) {
    class A : SClass("A", 100)

    class B : SClass("B", 100)

    class C : SClass("C", 100)
}