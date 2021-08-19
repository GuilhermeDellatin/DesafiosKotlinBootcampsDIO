package interAndroidDeveloper.praticandoAritmeticaEmKotlin

/*
Desafios:

Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha.

Exemplo de Entrada: 6
Exemplo de Saída: 2 4 6
 */

fun main() {

    for (i in 2.rangeTo(readLine()!!.toInt()).step(2)){
        println("$i")
    }

}