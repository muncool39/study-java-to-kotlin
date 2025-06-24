package com.lannstark.lec17

import java.io.BufferedReader
import java.io.FileReader

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    /*
    함수를 변수 선언, 이름 없는 함수 = 람다
     */
    // 방법 1
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
    // 방법 2 (많이 사용)
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }
    // 타입 표기 방법: (파라미터 타입) -> 반환 타입
    val isBanana: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "바나나" }


    // 호출 방법
    isApple(fruits[1])
    isApple.invoke(fruits[0])

    // 사용
    val fF = filterFruits(fruits, isApple)
    // 바로 전달도 가능하다
    // 함수에서 받는 함수 파라미터가 마지막에 위치한 경우, 아래처럼 중괄호를 밖으로 뺄 수 있다.
    val fF2 = filterFruits(fruits) { fruit -> fruit.name == "바나나" }
    // 익명함수에서 파라미터가 한 개인 경우, it 으로 줄일 수 있다. BUT 데이터 파악 어려워서 비추
    val fF3 = filterFruits(fruits) { it.name == "바나나" }

    /*
    Closure
    람다가 실행되는 시점에 쓰고 있는 변수들을 모두 포획한 데이터 구조
    = non-final 변수도 람다에서 사용 가능
     */
    var targetName = "바나나"
    targetName = "수박"
    val fF4 = filterFruits(fruits) { it.name == targetName }    // 문제 없음

    /*
    try with resources  : Closeable 구현체에 대한 확장 함수, inline 함수, 람다를 받게 만들어진 함수
    7강 참고
     */
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { br ->
            println(br.readLine())
        }
    }
}

/*
인자 (Fruit) -> Boolean  : Fruit 를 받아 Boolean 을 반환하는 함수 자체를 받겠다는 의미
 */
private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            result.add(fruit)
        }
    }
    return result
}




