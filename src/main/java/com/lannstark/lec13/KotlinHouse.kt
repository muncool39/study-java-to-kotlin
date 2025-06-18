package com.lannstark.lec13



fun main() {

}


class KotlinHouse (
    val address: String,
    val livingRoom: KLivingRoom
) {

    // 중첩 클래스
    class KLivingRoom (
        private val area: Double
    )

    // 내부 클래스 (권장X)
    // : 굳이 바깥 클래스를 참조하고 싶다면 inner 키워드를 붙여준다.
    inner class KLivingRoom2(
        private val area: Double
    ) {
        // 바깥 클래스 참조 -> this@바깥클래스 형태로 작성
        val address: String
            get() = this@KotlinHouse.address
    }
}