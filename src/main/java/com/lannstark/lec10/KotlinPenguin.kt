package com.lannstark.lec10

/*
인터페이스 구현도 : 을 사용
 */
class KotlinPenguin (
    species : String
) : KotlinAnimal(species, 2), KotlinSwimable, KotlinFlyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 이동합니다.")
    }

    /*
    getter override
     */
    override val legCount: Int
        get() = super.legCount + this.wingCount


    /*
    중복되는 인터페이스 특정시 super<타입>.함수 사용
     */
    override fun act() {
        super<KotlinFlyable>.act()
        super<KotlinFlyable>.act()
    }

    override val swimAbility: Int
        get() = 3

}