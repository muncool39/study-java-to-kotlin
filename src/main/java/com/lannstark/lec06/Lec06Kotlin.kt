package com.lannstark.lec06

fun main() {

    // (1) for each 문
    val numbers = listOf(1L, 2L, 3L)
    for(number in numbers){
        println(number)
    }

    /*
    .. 연산자  : 범위를 만들어 내는 연산자 (1..3 <- 1부터 3까지의 범위) Range 등차수열 만들기
    3 downTo 1  : 시작 3 끝 1 공차 -1    등차수열
    1..5 step   : 시작 1 끝 5 공차 2     등차수열
     */
    // (2) for 문
    for(i in 1..3) {
        println(i)
    }
    // 내려가는 경우
    for(i in 3 downTo 1) {
        println(i)
    }
    // 두 칸씩 올라가는 경우
    for(i in 1..5 step 2) {
        println(i)
    }

    // (3) while 문: Java 와 완전히 동일
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }

}


