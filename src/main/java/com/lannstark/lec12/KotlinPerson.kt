package com.lannstark.lec12

/*
코틀린에서 자바에서의 static 변수, 함수 생성을 위해선 companion object 사용한다.
companion object 는 하나의 객체로 간주 = 이름 붙이기, 다른 타입 상속 받기 가능
 */

class KotlinPerson private constructor(
    var name: String,
    var age: Int,
) {

    /*
    코틀린에는 static 키워드가 없음
    대신 companion object 블록 안에 넣어둔 함수 및 변수가 static 처럼 사용됨

    static: 클래스가 인스턴스화 될 때 정적으로 인스턴스끼리의 값을 공유 (새로운 값 X)
    companion object: 클래스와 동행하는 유일한 오브젝트
                        하나의 객체로 간주된다. -> 이름을 붙이거나 인터페이스 구현 가능
     */
    companion object Factory {
        /*
        그냥 val 로 사용할 경우 경고
         그냥 val: 런타임시에 할당됨
         const: 컴파일시에 할당됨, 진짜 상수에 붙이기 위한 용도
         */
        private const val MIN_AGE = 1

        @JvmStatic  // 자바에서 일반 static 사용하는 것처럼 바로 접근 가능
        fun newBaby(name: String): KotlinPerson {
            return KotlinPerson(name, MIN_AGE)
        }
    }

}