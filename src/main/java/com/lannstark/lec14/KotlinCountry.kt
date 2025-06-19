package com.lannstark.lec14


fun handleCountry(country: KotlinCountry) {
    /*
    1. 분기 처리가 편하다
    2. 컴파일러가 KotlinCountry 의 모든 타입을 알고 있어
       다른 타입에 대한 로직(else)을 작성하지 않아도 된다.
    3. Enum 에 변화가 있으면 알 수 있다. (IDE 단에서 주의 줌)
     */
    when (country) {
        KotlinCountry.KOREA -> TODO()
        KotlinCountry.AMERICA -> TODO()
    }
}

enum class KotlinCountry (
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US")
    ;
}