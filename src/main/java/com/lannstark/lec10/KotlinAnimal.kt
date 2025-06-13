package com.lannstark.lec10

/*
추상클래스
자동 생성되는 프로퍼티를 오버라이드 할 때 무조건 open 키워드를 붙여줘야 한다. (getter, setter)
*/
abstract class KotlinAnimal (
    protected val species: String,
    protected open val legCount: Int
) {

    abstract fun move()

}