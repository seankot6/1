fun main() {
    println("Введите число:")
    val inputNumber = readLine()?.toIntOrNull()
    if (inputNumber != null) {
        println("Вы ввели число: $inputNumber")
    } else {
        println("Некорректный ввод.")
    }
}
