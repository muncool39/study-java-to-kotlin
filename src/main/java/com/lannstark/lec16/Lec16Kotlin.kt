package com.lannstark.lec16

fun main() {
    val str = "ABC"
    println(str.lastChar()) // 원래 String 에 있는 멤버함수처럼 사용할 수 있음

    val person = Person("A", "B", 23);
    person.nextYearAge()    // 멤버 함수
}


/*
확장함수: 기능을 확장

fun 확장하려는클래스.함수이름(파라미터): 리턴타입{
    this 이용해 실제 클래스 안의 값에 접근
}

*this: 수신객체
*확장하려는클래스: 수신객체 타입

 */
fun String.lastChar(): Char {
    return this[this.length - 1]
}

/*
멤버 함수와 확장 함수의 시그니처가 같다면?
= 멤버 함수가 우선적으로 호출됨
 */
fun Person.nextYearAge(): Int{
    println("코틀린 확장 함수")
    return this.age + 1
}

/*
어떻게 선언했는지...
해당 변수의 현재 타입 <- 정직인 타입에 의해 어떤 확장함수가 호출될지 결정됨
 */
fun check() {
    val train: Train = Train()
    train.isPriced()    // Train 확장함수

    val srt1: Train = Srt()
    srt1.isPriced()     // Train 확장함수

    val srt2: Srt = Srt()
    srt2.isPriced()     // SRT 확장함수
}

open class Train(
    val name: String = "기차",
    val price: Int = 200
)

fun Train.isPriced(): Boolean {
    println("Train 확장함수")
    return this.price >= 1000
}

class Srt : Train("SRT", 10000)

fun Srt.isPriced(): Boolean {
    println("SRT 확장함수")
    return this.price >= 1000
}

/*
infix 중위 함수

변수.함수이름(arg)    대신
변수 함수이름 arg     처럼 호출 가능
 */

fun infixTest() {
    3.add(2)

    3 add2 2
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

/*
inline 함수

함수가 호출되는 대신, 함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우
언제 사용? -> 함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있음
BUT 신줄하게 사용하기
 */

fun inlineTest() {
    3.add3(2)
}

inline fun Int.add3(other: Int): Int {
    return this + other
}

/*
지역 함수
= 함수 안에 함수 선언

함수로 추출하면 좋을 것 같은데 지금 함수 내에서만 사용하고 싶을 때 ...
BUT 그닥 깔끔하지 않다 ...
 */
fun createPerson(firstName: String, lastName: String): Person {
    // 함수 안에 선언
    fun validateName(name: String, fieldName: String) {
        if(name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다. 현재: $name")
        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}


















