package com.lannstark.lec10

interface KotlinSwimable {

    /*
    이런 프로퍼티를 생성 가능
    해당 인터페이스 구현 시 해당 getter setter 생성을 기대
     */
    val swimAbility: Int
        get() = 0 // 기본 값 설정 가능

    fun act() {
        println("어푸 어푸")
    }
}