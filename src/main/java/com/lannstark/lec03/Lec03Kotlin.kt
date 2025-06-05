package com.lannstark.lec03

class Lec03Kotlin {
    /*
    Any: 자바의 Object 역할, 모든 최상의 타입으로 사용됨.
    Unit: 자바의 void 역할, 실제 존재하는 타입이라는 것을 표현.
    Nothing: 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할 (별로 안씁)
     */
}

fun main() {
    val number = 3
    val number2: Long = number.toLong() // 코틀린은 명시적으로 타입 변환을 해준다
    print(number + number2)
    /*
    코틀린에서 타입 변환을 하기 위해서는 명시적으로 to 변환타입을 사용한다.
     */
    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L // nullable 경우의 처리도 반드시 해준다

    printAgeIfPerson(Person("", 30))
    nullCheck(null)

    // (1) String 출력
    val person = Person("문시원", 23)
    println("이름 ${person.name}")

    // (2) 문자열에서 문자 가져오기
    val abc = "ABC"
    println(abc[0])

    // 문자열 사용하기
    val str = """
        여기에 자유롭게 문자열을 작성하면 된다.
        이름은 ${person.name} <- 이렇게 넣기도 가능
        너무 신기해요!!
    """.trimIndent()

    println(str)
}

fun printAgeIfPerson(dbj: Any) {
    /*
    is: 자바에서의 instanceof (변수가 주어진 타입이면 true, 아니라면 false)
    반대의 의미를 사용하려면 !is 를 사용한다.
     */
    if (dbj is Person) {
        /*
        as: 자바에서의 () ex.(Person) obj
         */
        val person = dbj as Person // 위에서 체크되었기 때문에 생략 가능
        println(person.age)
    }
}
/*
null 이 들어올 수 있는 경우
 */
fun nullCheck(dbj: Any?) {
    /*
    as?: null 이 아니라면 변화시키고 아니면 null 반환
    ?없으면 null 들어올 때 오류 발생
     */
    val person = dbj as? Person
    println(person?.age)
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}