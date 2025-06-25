package com.lannstark.lec18


data class Fruit (
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
) {
    fun nullOrValue(fruit: Fruit?): Fruit? {
        return fruit
    }

    val isSamePrice: Boolean
        get() = factoryPrice == currentPrice
}

fun main(){
    val fruits = listOf(
        Fruit(1, "사과", 1_000, 1000),
        Fruit(2, "사과", 1200, 1000),
        Fruit(5, "바나나", 3000, 1000),
        Fruit(6, "바나나", 3200, 1000),
        Fruit(8, "수박", 10000, 1000)
    )

    // filter
    val apples = fruits.filter { fruit ->  fruit.name == "사과"}

    // filter 에 index 필요한 경우
    val idxEx = fruits.filterIndexed { index, fruit ->
        println(index)
        fruit.name == "바나나"
    }

    // map
    val applePrices = fruits.filter { fruit ->  fruit.name == "사과"}
        .map { fruit ->fruit.currentPrice }

    // null 아닌 값만
    val values = fruits.filter { fruit ->  fruit.name == "사과"}
        .mapNotNull { fruit ->  fruit.nullOrValue(fruit) }


    /*
    다양한 컬렉션
     */

    // all: 조건을 모두 만족하면 true, 그렇지 않으면 false
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }

    // none: 조건을 모두 불만족하면 true, 그렇지 않으면 false (람다의 결과가 모두 false 여야 true)
    val isNoApple = fruits.none { fruit -> fruit.name == "사과" }

    // any: 조건을 하나라도 만족하면 true, 그렇지 않으면 false
    val isAnyApple = fruits.any { fruit ->  fruit.name == "사과" }

    // count: 개수 카운트
    val fruitCount = fruits.count()

    // sortedBy: 오름차순 정렬
    val fruitOrder = fruits.sortedBy { fruit -> fruit.currentPrice }

    // sortedByDescending: 내림차순 정렬
    val fruitOrderDesc = fruits.sortedByDescending { fruit -> fruit.currentPrice }

    // distinctBy: 값 기준으로 중복 제거
    val disFruitName = fruits.distinctBy { fruit -> fruit.name }    // 이름 기준으로 중복 제거
        .map { fruit -> fruit.name }    // 이름만 남기기

    fruits.first()          // first: 첫 번째 값을 가져옴 (무조건 null 아니여야 함 Exception 발생)
    fruits.firstOrNull()    // firstOrNull: 첫 번째 값 또는 null 가져옴

    fruits.last()
    fruits.lastOrNull()

    /*
    List 를 Map 으로
     */

    // groupBy
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }  // 과일 이름이 key 됨

    // associateBy: 리스트가 아니라 하나 매핑될 때 (리스트 X, 단일 객체 O)
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    // 값 커스텀
    val map3: Map<String, List<Long>> = fruits
        .groupBy ({fruit -> fruit.name}, {fruit -> fruit.factoryPrice})

    // 값 커스텀 (리스트 X, 단일 객체 O)
    val map4: Map<Long, Long> = fruits
        .associateBy({fruit -> fruit.id}, {fruit -> fruit.factoryPrice})

    // 위처럼 값 두개 받는 경우는 소괄호 안에 넣어준다

    /*
    같이 사용 가능
     */
    val mapF: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과" }


    /*
    중첩 컬렉션 처리
     */
    val fList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "사과", 1_000, 1000),
            Fruit(2, "사과", 1200, 1000),
        ),
        listOf(
            Fruit(4, "사과", 1_000, 1000),
            Fruit(5, "바나나", 3000, 1000),
        ),
        listOf(
            Fruit(6, "바나나", 3200, 1000),
            Fruit(8, "수박", 10000, 1000)
        ),
    )

    // flatMap: List-List 가 단일 List 로 바뀜
    val samePriceFruits = fList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice != fruit.currentPrice }
    }

    // 위처럼 람다가 중첩된 부분 다음과 같이 수정도 가능 (isSamePrice, samePriceFilter 추가)
    val samePriceFruits2 = fList.flatMap { list -> list.samePriceFilter }

    // flatten: 중첩되어 있는 컬렉션 중첩 해제 됨 (평탄화)
    fList.flatten()

}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)


// 이렇게 가능
private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}




