package com.lannstark.lec14


fun main() {
    val dto1 = KotlinPersonDto("시원", 24)
    println(dto1) //KotlinPersonDto(name=시원, age=24)   <- toString 이 자동으로 구현됨
    val dto2 = KotlinPersonDto("시원", 23)
    println(dto1==dto2) // false
    val dto3 = KotlinPersonDto("시원", 23)
    println(dto2==dto3) // true
}

/*
data 키워드 -> equals, hashCode, toString 자동으로 만들어 준다
 */
data class KotlinPersonDto (
    val name: String,
    val age: Int
) {
}