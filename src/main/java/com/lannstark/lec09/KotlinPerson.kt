package com.lannstark.lec09

fun main() {
    val person = KotlinPerson("시원", 23)
    println(person.name)
    person.age = 24 // setAge 없이 바로 호출 가능 (Java 클래스를 가져와 사용할 때도 가능)

    // (2)
    val person2 = KotlinPerson("시원")
}


/*
(1) 클래스와 프로퍼티
public 생략 가능
생성자는 위에 위치한다. constructor() <- 생략 가능
생성자와 프로퍼티(필드+setter+getter)를 동시에 선언할 수 있다.
필드 만들면 getter setter 자동으로 생성
 */
/*
primary constructor 주 생성자(맨 위)는 반드시 존재해야 함
 */
/*
(2) 부생성자보다는 기본값을 사용하는 것이 선호된다. (또는 정적 팩토라 메서드)
 */
class KotlinPerson (
    name: String = "시원",
    var age: Int
) {

    // (3) ex. get 될 때 무조건 대문자로 반환해주기 (커스텀 getter 라 위 주 생성자에서 val 을 빼준다)
    /*
    주생성자에서 받은 name 을 불변 프로퍼티 name 에 바로 대입
    field 대신 name 을 사용할 경우 name 이 name getter 을 다시 호출함 = 무한루프
    field: 자기 자신을 가리키는 예약어 (backing field)
     */
    /*
    val name = name
    get() = field.uppercase()
    */
    // field 사용 대신 요구사항을 달성하는 프로퍼티를 생성
    fun getUpperCase(): String {
        return this.name.uppercase()
    }
    val uppercaseName: String
        get() = this.name.uppercase()

    // (3) 커스텀 setter ex.name 넣을 때 반드시 대문자로 넣기 (사실 이것도 잘 안쓰죠 setter 는)
    // 여기서도 무한루프 방지 field, value: 밖에서 들어오는 값
    var name = name
    set(value) {
        field = value.uppercase()
    }



    // (2) 생성자와 init (코틀린에 존재) ex)생성되는 시점에 나이 검증하기
    // init: 클래스가 초기화되는 시점에 호출됨
    init {
        if(age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    // (2) 생성자 추가하기
    /*
    secondary constructor 부 생성자
    최종적으로 주 생성자를 this 로 호출해야 함
    body 를 가질 수 있음 (블록{} 안에 코드를 넣을 수 있음)
     */
    constructor(name: String) : this(name, 1) {
        println("부생성자입니다.")
    }

    /*
    부생성자를 this 로 호출 <- 호출된 생성자가 먼저 실행됨
     */
    constructor(): this("시원") {
        println("최종적으로 주생성자를 호출합니다.")
    }

    // (3) 커스텀 getter setter
    /*
    fun isAdult(): Boolean {
        return this.age >= 20
    }
    */
    /*
    함수 대신 프로퍼티처럼 만들 수 있다.
    자바에서는 함수로 인식 (역할은 같음)
    객체 속성이라면 custom, 아니면 함수를 사용하는 것이 좋지 않을까 하시는 개인적인 의견을 말씀해주심
     */
    val isAdult: Boolean
        get() = this.age > 0
    /*
    val isAdult: Boolean
        get() {
            return this.age > 0
        }
     */



    // val name: String = name
    // var age: Int = age
}








