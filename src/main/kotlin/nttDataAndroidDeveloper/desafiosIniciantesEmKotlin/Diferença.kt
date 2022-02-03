package nttDataAndroidDeveloper.desafiosIniciantesEmKotlin

/*
Leia quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto de A e B
pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas,
 conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.


Exemplos de Entrada:
5
6
7
8

Exemplos de Saída:
DIFERENCA = -26

Exemplos de Entrada:
0
0
7
8

Exemplos de Saída:
DIFERENCA = -56

Exemplos de Entrada:
5
6
-7
8

Exemplos de Saída:
DIFERENCA = 86
 */

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()
    val d = input.nextInt()
    val diferenca = ((a * b) - (c * d))
    println(" DIFERENCA = ${diferenca}")
}