package com.lannstark.lec15

fun main() {

    // (1) 배열
    val array = arrayOf(100, 200)

    for(i in array.indices){
        print("${i}, ${array[i]}")
    }
    // withIndex: index 와 value 를 한번에 받음
    for((idx, value ) in array.withIndex()){
        println("${idx}, ${value}.")
    }
    // 배열에 값 추가
    array.plus(300)


    // (2) Collection
    /*
    불변인지 가변인지 반드시 명시한다.
     가변(Mutable) 컬렌션:   컬렉션에 element 추가 및 삭제 가능
     불변 컬렉션:            컬렉션에 element 추가 및 삭제 불가능
    불변 컬렉션이라도 레퍼런스 타입 안의 필드는 바꿀 수 있다.
     */

    // (2) Collection - List
    val nums = listOf(100, 200)         // 불변 리스트 생성
    val mNums = mutableListOf(300, 200) // 가변 리스트 생성: mutableListOf
    mNums.add(300)
    val emptyList = emptyList<Int>()    // 비어있는 리스트 생성, 타입 명시 필요
    // 하나 가져오기
    nums[0]
    // for each
    for (num in nums){
        println(num)
    }
    // 전통적인 for 문
    for((index, value) in nums.withIndex()){
        println("$index + $value")
    }

    // Collection - Set
    val sNums = setOf(100, 200)
    val smNums = mutableSetOf(300, 200)

    // Collection - Map
    val mMap = mutableMapOf<Int,String>()
    mMap[1] = "A"
    mMap[2] = "B"

    mapOf(1 to "A", 2 to "B")

    for(key in mMap.keys) {
        println("$key = $mMap[key]")
    }

    for((key, value) in mMap.entries) {
        println("$key = $value")
    }

    // (3) Null 가능성
    /*
    List<Int?>  : 리스트에 null 이 들어갈 수 있지만, List 는 절대 null 이 아님
    List<Int>?  : 리스트에 null 이 들어갈 수 없지만, List 는 null 일 수 있음
    List<Int?>? : 리스트에 null 이 들어갈 수도 있고, List 가 null 일 수도 있음
     */

}












