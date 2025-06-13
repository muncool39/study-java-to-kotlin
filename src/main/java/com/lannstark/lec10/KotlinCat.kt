package com.lannstark.lec10

/*
코틀린은 extends 대신 : 을 통해 상속,
무조건 생성자를 바로 호출
 */
class KotlinCat (
    species : String
) : KotlinAnimal(species, 4) {

    /*
    오버라이드를 키워드처럼 사용 (필수)
     */
    override fun move() {
        println("고양이가 움직입니다.")
    }
}