package com.lannstark.lec12

/*
익명클래스
 자바:     new 타입이름()
 코틀린:    object: 타입이름
 */

fun main() {

    // 익명 클래스: object 키워드 활용해 생성 (인터페이스를 상속받은 object 생성)
    moveSomething(object : Movable{
        override fun move() {
            println("움직임");
        }

        override fun fly() {
            println("남");
        }
    })
}


private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}