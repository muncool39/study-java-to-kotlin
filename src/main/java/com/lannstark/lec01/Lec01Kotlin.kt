package com.lannstark.lec01

class Lec01Kotlin {

    /*
    모든 변수에는 수정 가능 여부 (var/val) 반드시 작성한다.
    타입은 명시하지 않아도 알아서 추론된다.
    단, 초기값이 없는 경우엔 반드시 작성한다.
     */

    var number1 = 10L // (1)

    val number2 = 10L // (2) final

    var number3: Long = 10L // (3) 박싱/언박싱을 코틀린이 적절히 처리한다.

    // 그럼 null 처리는? -> null 가능 여부를 타입 옆에 ? 붙여서 명시한다.

    var number4: Long? = null

    var person = Person("문시원") // (4) new 붙이지 않는다.

}