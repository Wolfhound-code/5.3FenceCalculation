package org.example

import kotlin.math.roundToInt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите длину первой стороны")
    val a = readLine()?.toDouble() ?: 0.0
    println("Введите длину второй стороны")
    val b = readLine()?.toDouble() ?: 0.0
    println("Введите длину третьей стороны")
    val c = readLine()?.toDouble() ?: 0.0
    println("Введите длину четвертой стороны")
    val d = readLine()?.toDouble() ?: 0.0
    calcFenceMaterials(a, b, c, d)
}
fun calcFenceMaterials(a: Double, b: Double, c: Double, d: Double) {
    val minSide = 2
    val maxSide = 300
    val polesGap = 2.5 // расстояние между столбами
    val listWidth = 1.15 // ширина листа
    if (a < minSide || b < minSide || c < minSide || d < minSide) {
        println("Стороны участка должны быть не менее $minSide метров")
        return
    }
    if (a > maxSide || b > maxSide || c > maxSide || d > maxSide) {
        println("Стороны участка должны быть не более $maxSide метров")
        return
    }
    val perimeter = a + b + c + d
    val polesAmount = ((perimeter / polesGap) * 1.1).roundToInt()
    val fenceListAmount = ((perimeter / listWidth) * 1.15).roundToInt()
    println("Необходимое количество столбов: $polesAmount")
    println("Необходимое количество листов профлиста: $fenceListAmount")
}