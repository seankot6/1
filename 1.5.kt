fun main() {
    println("Введите число:")
    val inputNumber = readLine()?.toIntOrNull()
    if (inputNumber != null) {
        println("$inputNumber — вот какое число Вы ввели")
    } else {
        println("Некорректный ввод.")
    }
}
