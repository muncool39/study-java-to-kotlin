package com.lannstark.lec08

fun main() {
    /*
    (2)
    매개변수 이름을 통해 값을 직접 지정할 수 있음
    지정되지 않은 매개변수는 기본값이 사용됨
     */
    repeat("Hi", useNewLine = false)
    /*
    (3)
    자바 함수를 가져와 사용할 때는 불가능
     */
    printNameAndGender(gender = "여성", name = "시원")
    /*
    (4)
    배열을 넘길때는 *릏 사용해야 한다. (spread 연산자)
     */
    printAll("A", "B", "C")
    val arr = arrayOf("A", "B", "C")
    printAll(*arr)
}

// (1) 함수 선언
/*
함수가 하나의 결과값이면 block 대신 = 을 사용할 수 있다.
= 사용하면 추론되기 때문에 : Int 생략 가능, (block{} 사용하면 생략 안된다.
 */
fun max(a: Int, b: Int): Int = if (a > b) a else b

// (2) default parameter
/*
파라미터 기본값을 지정할 수 있다.
 */
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for(i in 1..num) {
        if(useNewLine) println(str)
        else println(str)
    }
}

// (3) named argument
fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

// (4) 같은 타입의 여러 파라미터 받기 (가변 인자) ex)문자열을 N개 받아 출력
/*
가변 인자를 vararg 를 적어 명시한다.
 */
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}






