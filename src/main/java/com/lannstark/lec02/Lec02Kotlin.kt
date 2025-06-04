package com.lannstark.lec02

class Lec02Kotlin {
}


fun safeCall() {
    val str: String? = "ABC"
    // str.length  <- null 가능하기 때문에 불가능
    str?.length // (?.) Safe Call: null 아니면 실행, null 인 경우 실행하지 않음
}

fun elvis() {
    val str: String? = "ABC"
    println(str?.length ?: 0) // Elvis 연산자: 앞의 연산 결과가 null 이면 뒤의 값을 사용
}

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A") // !!로 null 이 절대 아님을 명시 가능
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("String cannot be null")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}