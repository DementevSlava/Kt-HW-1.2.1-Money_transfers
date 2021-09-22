package ru.netology

fun main() {

    val card = 14000_00
    val transfer = 100_00
    val commission = transfer * 75 / 1000
    val amount = if (commission > 35_00) {
        card - transfer - commission
    } else {
        card - transfer - 35
    }
    print(amount)
}