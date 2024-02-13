//Imprimir Números Pares:

fun imprimirNumerosPares(n: Int) {
    for (i in 0..n step 2) {
        println(i)
    }
}

//Factorial de un Número:

fun calcularFactorial(numero: Int): Long {
    var factorial: Long = 1
    for (i in 1..numero) {
        factorial *= i.toLong()
    }
    return factorial
}

//Suma de Números Impares:

fun sumarNumerosImpares(n: Int): Int {
    var suma = 0
    for (i in 1..n step 2) {
        suma += i
    }
    return suma
}