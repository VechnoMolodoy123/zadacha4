fun main() {
    println("Введите два числа и операцию (например, 5.0 3.0 +):")

    val input = readlnOrNull()

    // Проверка на то, что ввод не пустой
    if (!input.isNullOrBlank()) {
        // Разделение строки на части при помощи split
        val parts = input.split(" ")

        // Проверка на то, что введено ровно 3 части
        if (parts.size == 3) {
            val number1 = parts[0].toDoubleOrNull()
            val number2 = parts[1].toDoubleOrNull()
            val operation = parts[2]

            // Проверка корректности чисел
            if (number1 != null && number2 != null) {
                var result: Double? = null

                // Выполнение операции
                when (operation) {
                    "+" -> result = number1 + number2
                    "-" -> result = number1 - number2
                    "*" -> result = number1 * number2
                    "/" -> if (number2 != 0.0) result = number1 / number2 else println("Ошибка: Деление на ноль")
                    else -> println("Ошибка: Неверная операция")
                }

                // Вывод результата, если он вычислен
                if (result != null) {
                    println("Результат: $result")
                }
            } else {
                println("Ошибка: Введите корректные числа.")
            }
        } else {
            println("Ошибка: Введите два числа и операцию.")
        }
    } else {
        println("Ошибка: Ввод пустой.")
    }
}