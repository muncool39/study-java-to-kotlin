package com.lannstark.lec12

fun main() {
    println(KotlinSingleton.a)  // 0
    KotlinSingleton.a += 10
    println(KotlinSingleton.a)  // 10
}


/*
싱글톤: 단 하나의 인스턴스만을 갖는 클래스

코틀린에서는 object 만 붙여주면 끝...
 */
object KotlinSingleton {
    var a: Int = 0
}