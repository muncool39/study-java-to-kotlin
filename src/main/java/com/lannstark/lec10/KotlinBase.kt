package com.lannstark.lec10

fun main() {
    KotlinDerived(300)
}


/*
그냥 클래스끼리 상속받을 때
 */
open class KotlinBase(
    open val number: Int = 100
) {
    init {
        println("KotlinBase init")
        // println(number) : 상위 클래스에서 하위 필드에(final 이 아닌) 접근해도 아무것도 안나옴
        /*
        상위 클래스를 설계할 때 생성자 or 초기화 블록에 사용되는 프로퍼티는 open 을 피하자
        키워드
         open: override 를 열어줌
         abstract: 반드시 override 해야함
         override: 상위 타입 오버라이드 명시
         */
    }
}


class KotlinDerived(
    override val number: Int
) : KotlinBase(number) {

    init {
        println("KotlinDerived init")
    }
}