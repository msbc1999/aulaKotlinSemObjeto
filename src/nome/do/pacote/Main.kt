package nome.`do`.pacote

import java.lang.StringBuilder

fun main() {
    println("Exercicio 1: ${ex1(1,2,3)}")
    println("Exercicio 2: ${ex2("texto1","text2")}")
    println("Exercicio 3: ${ex3(5)}")
    println("Exercicio 4: ${ex4()}")
}

// retorna o maior dos numeros
fun ex1(n1: Int, n2: Int, n3: Int): Int {
    return maxOf(n1, n2, n3) // usa a funcao pronta
}

// verifica se os textos sao diferentes
fun ex2(t1: String, t2: String): Boolean {
    return !t1.equals(t2) // funcao pronta
}

// verifica se eh par
fun ex3(i: Int): Boolean {
    return i % 2 == 0 // verifica se o modulo eh zero
}

// retorna os 100 primeiros numeros impares em String. dei uma melhoradinha
fun ex4(): String {
    var sb = StringBuilder()
    var qt = 0 // a quantidade de numeros mostrados
    var n = 0; // o numero atual
    while (qt < 100) {
        if (!ex3(n)) { // verifica se eh impar
            if (!sb.isEmpty()) sb.append(", ") // adiciona a virgula depois do texto
            sb.append(n) // adiciona o numero
            qt++ // aumenta a quantidade de numeros mostrados
        }
        n++ // aumenta o numero atual
    }
    return sb.toString() // retorna em String para mostrar direitinho
}
// ex4 versao simples
fun ex4_simples(): String {
    var resultado = "";
    var qt = 0 // a quantidade de numeros mostrados
    var n = 0; // o numero atual
    while (qt < 100) {
        if (!ex3(n)) { // verifica se eh impar
            resultado += "$n, " // adiciona o numero na variavel resultado
            qt++ // aumenta a quantidade de numeros mostrados
        }
        n++ // aumenta o numero atual
    }
    return resultado // retorna em String para mostrar direitinho
}

// exercicio 5 (???)
fun ex5(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return (numA > numC && numA > numD) || (numB > numC && numB > numD);
}