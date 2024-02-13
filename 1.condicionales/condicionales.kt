// Verificación de Número Par:
fun verificarNumeroPar(numero: Int): String {
    return if (numero % 2 == 0) {
        "El número es par."
    } else {
        "El número es impar."
    }
}
//Determinar el Mayor de Dos Números:


fun obtenerMayor(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}
//Clasificación de Edades:


fun clasificarEdad(edad: Int): String {
    return when {
        edad < 18 -> "Eres menor de edad."
        edad in 18..65 -> "Eres un adulto."
        else -> "Eres un adulto mayor."
    }
}

//Calificación de Notas:

fun calificarNota(nota: Int): String {
    return when (nota) {
        in 90..100 -> "Excelente"
        in 80..89 -> "Muy Bueno"
        in 70..79 -> "Bueno"
        in 60..69 -> "Suficiente"
        else -> "Insuficiente"
    }
}
// Verificación de Tipo de Triángulo:


fun tipoDeTriangulo(a: Int, b: Int, c: Int): String {
    return if (a == b && b == c) {
        "Equilátero"
    } else if (a == b || b == c || a == c) {
        "Isósceles"
    } else {
        "Escaleno"
    }
}