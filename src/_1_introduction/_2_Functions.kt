package _1_introduction

fun printMessage(message: String): Unit {   // 1 - Unit definido de maneira explícita. Unit quer dizer que a função não retorna nada
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") { // 2 - Unit é definido de maneira implícita. Essa função possui um valor default, "Info"
    println("[$prefix] $message") // Interpolação de Strings
}

fun sum(x: Int, y: Int): Int {  // Função retorna Int
    return x + y    // Retorna a soma dos valores passados
}

fun multiply(x: Int, y: Int) = x * y    // Implicitamente entende que o retorno será essa operação

fun main() {
    printMessage("Hello, World!")
    printMessageWithPrefix("Hello", "Log")
    println(sum(2, 4))
    println(multiply(3, 4))
}