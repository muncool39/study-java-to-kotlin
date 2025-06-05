package com.lannstark.lec04

data class KotlinMoney(
    val amount: Long
) {
    // JavaMoney plus 와 동일
    operator fun plus(kotlinMoney: KotlinMoney): KotlinMoney {
        return KotlinMoney(this.amount + kotlinMoney.amount)
    }
}