package com.lannstark.lec05

class Lec05Kotlin {
}

fun main() {
    getPassOrFail(50)
}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}
/*
if-else 문
 Statement: 프로그램 문장 전체, 하나의 값으로 도출되지 않음
 Expression: 반드시 하나의 값으로 도출되는 문장 (Statement 안에 포함됨)
자바에서는 if 문을 하나의 값으로 취급하지 않음(Statement). 대신 삼항연산자가 사용됨
코틀린에서는 하나의 값으로 취급(Expression). 삼항연산자가 없다
 */
fun getPassOrFail(score: Int): String {
    // Expression 하게 반환
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun validate(score: Int) {
    // 반대의 경우 !를 붙여준다. (!in)
    if (score in 1..100) {
        println("범위 내에 존재합니다.")
    }
}

// switch-case-default 아닌 when-조건부-else 이 사용된다. 얘도 Expression
fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        // 조건부에 어떠한 Expression 이라도 사용 가능 (다양한 조건 사용 가능)
        // ex) is String / else 사용 가능
        in 90..99 -> "A";
        in 80..89 -> "B"
        in 70..79 -> "C";
        else -> "D"
    }
}

fun judgeNumber1(number: Int) {
    when (number) {
        1, 0, -1 -> println("많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    // 이런식으로 when ()안에 조건을 넣지 않아도 된다.
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number %2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어지는 숫자는 홀수입니다")
    }
}





