package lesson.lesson01.lesson0101

/*
6.
 */

fun main() {
    println("Привет!")
    println("Напишите сколько км. пробежал спортсмен в 1-й день:")
    var a = readLine()?.toDouble()?: 0.0
    println("Напишите сколько км. он должен суметь пробежать:")
    val b = readLine()?.toDouble()?: 0.0
    var n = 0
    println("Результат:")

    if (b <= a) {
        println("Напишите спортсмену большее количество км. который он должен пробежать")
    }
    else {
        while (b >= a) {
            a += (a * 0.1)
            n++
            println("$n-й день: ${a.toInt()} км")
        }
        println("Ответ: на $n-й день спортсмен достиг результата - не менее $b км")
    }
}