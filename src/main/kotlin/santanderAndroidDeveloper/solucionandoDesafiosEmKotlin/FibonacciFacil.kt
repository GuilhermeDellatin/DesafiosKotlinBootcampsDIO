package santanderAndroidDeveloper.solucionandoDesafiosEmKotlin


/*
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci.
Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores.
Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

Saída
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco.
Não deve haver espaço após o último valor.

Exemplo de Entrada: 5
Exemplo de Saída: 0 1 1 2 3
 */

fun main() {

    val n = readLine()!!.toInt()
    fibo(n)
}

val fibo: (Int) -> Unit = { number ->
    var a = 1
    var b = 0
    var sum: Int
    val list: MutableList<String> = mutableListOf("0")
    list.add(" ")

    for (i in 0 until number - 1) {
        list.add(a.toString())
        list.add(" ")

        sum = a
        a += b
        b = sum
    }

    list.forEach {
        print(it)
    }

}