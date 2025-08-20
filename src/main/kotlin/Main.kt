package org.example

import kotlin.math.roundToInt
import kotlin.random.Random
import kotlin.text.compareTo

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val hiddenNumber = Random.nextInt(20) + 1
    var attempt = 1
    println("Загадано число от 1 до 20. Попробуйте его угадать")
    do {
        // вводим данные
        val userNumber = getUserNumber()
        when {
            userNumber == hiddenNumber -> {
                println("Вы угадали, было загадано число: $hiddenNumber! Количество попыток: $attempt")
                return
            }

            hiddenNumber > userNumber -> {
                println("Загаданное число больше")
                println("Попытка №: $attempt")
            }

            else -> {
                println("Загаданное число меньше")
                println("Попытка №: $attempt")
            }
        }
        attempt++
    } while (true)
    }

    fun getUserNumber(): Int {
    do {
        println("Введите число от 1 до 20")
        val number = readLine()!!.toInt()
        if (number < 1 || number > 20) {
            println("Некорректный ввод!")
        } else {
            return number
        }
    } while (true)

}