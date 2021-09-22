package ru.netology

fun main() {

    val transfer = 100_00
    val commission = transfer * 75 / 1000
    val amount = if (commission > 35_00) {
        transfer - commission
    } else {
        transfer - 35
    }
    print(amount)
}