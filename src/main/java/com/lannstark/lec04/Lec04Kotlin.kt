package com.lannstark.lec04

class Lec04Kotlin {
    /*
    단항 산술 산술 대입 -> 자바와 동일
    비교도 같지만 compareTo 알아서 처리해준다.
    코틀린에서는 객체마다 연산자 직접 정의가 가능
     */
}

fun kMoney() {
    val money1 = KotlinMoney(1_000L)
    val money2 = KotlinMoney(2_000L)

    // (3) plus 연산 -> 연산자로 사용 가능 (오버로딩)
    println(money1 + money2)
}

fun main() {
    val money1  = JavaMoney(2_000L)
    val money2  = JavaMoney(3_000L)

    // (1) 객체간의 비교  Kotlin -> 비교연산자를 사용하면 자동으로 compareTo 를 호출한다.
    if (money1 > money2) {
        println("머니1이 머니2보다 금액이 큽니다.")
    }

    val money3 = JavaMoney(2_000L)
    val money4 = money1

    // (2) 동일성(값) ==, 동등성(주소) ===
    println(money1 == money3)   // true
    println(money1 == money4)   // true
    println(money1 === money3)  // false
    println(money1 === money4)  // true

    // Lazy 연산: 앞 통과하면 뒤는 확인하지 않음 (자바와 동일)
    if( fun1() || fun2() ) {
        println("본문")
    }

    kMoney()
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return true
}