package com.lannstark.lec19

/*
as import: 어떤 클래스나 함수를 임포트 할 때 이름을 바꾸는 기능
 */
import com.lannstark.lec19.a.printHello as printA
import com.lannstark.lec19.b.printHello as printB   // 함수 이름을 바꿔서 실행

fun sameName() {
    printA()
    printB()
}
// 같은 이름의 함수를 한 파일 내에서 동시에 import 가능하게 된다.


/*
Type Alias

(String) -> Boolean 이란 타입이 너무 길어!
 */
fun filterFruits(filter: (String) -> Boolean) {
}

// 타입 별칭 사용
typealias B_Filter = (String) -> Boolean

fun filterFruits2(filter: B_Filter) {

}

// 이름이 긴 클래스를 컬렉션에 사용할 때도 간단히 줄일 수 있다.
data class UltraSuperGuardianTribe(
    val name: String,
)

typealias USGTMap =UltraSuperGuardianTribe


/*
구조 분해 & componentN 함수
 */
// data class 가 componentN 이라는 함수도 자동으로 만들어 줌
data class Person(
    val firstName: String,
    val lastName: String
)

fun main() {
    val person = Person("mun", "cool")
    val (firstName, lastName) = person  // 구조 분해 -> component 함수로 출력
    // val firstName = person.component1()  // componentN : N번째 프로퍼티 가져옴
    // -> firstName 이런 변수명을 인식해서 가져오는 것이 아니라 프로퍼티 순서에 맞게 가져오는 것
    print("First Name: $firstName , Last Name: $lastName")
}

// data class 아닌데 component 처럼 사용하려면 함수 만들어주면 됨
class Ex(
    val ex: String,
) {
    // operator
    operator fun component1(): String {
        return this.ex
    }
}


/*
Jump & Label

특정 expression 라벨이름@ 을 붙여 하나의 라벨로 간주하고
break, continue, return 등을 사용하는 기능

BUT... 비추요
 */
fun main2() {
    val numbers = listOf(1, 2, 3)
    // forEach 에서는 continue 또는 break 사용 불가
    numbers.forEach { num ->
        println(num)
    }
    // 굳~이굳이 break 사용하고 싶다면 run 으로 감싼 후
    run {
        numbers.forEach { num ->
            if(num == 1) {
                return@run              // return@run : break(같은 효과) -> run 을 가리켜 리턴시킴
            } else if(num == 2) {
                return@forEach          // return@forEach : continue(같은 효과) -> forEach 를 가리켜 리턴시킴
            }
            println(num)
        }
    }

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            if(j == 1) {
                break@loop  // 보통이면 가까운 for 문을 break 하지만, 맨 위의 loop 를 break
            }
        }
    }
}


/*
TakeIf와 TakeUnless

코틀린에서는 method chaning 을 위한 특이한 함수를 제공
 */

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

// takeIf : 주어진 조건을 만족하면 그 값, 아니라면 null 이 반환된다.
fun getNumberOrNull2(number: Int): Int? {
     return number.takeIf { it > 0 }    // 위의 조건문과 동일한 코드
}
// takeUnless : 주어진 조건을 만족하지 않으면 그 값, 아니라면 null 이 반환
fun getNumberOrNull3(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}




