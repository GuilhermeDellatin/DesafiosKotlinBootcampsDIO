package carrefourAndroidDeveloper.desafiosNumericosEmKotlin

/*
A tarefa aqui neste problema é ler uma expressão matemática na forma de dois números Racionais
(numerador / denominador) e apresentar o resultado da operação.
Cada operando ou operador é separado por um espaço em branco.
A sequência de cada linha que contém a expressão a ser lida é:
 número, caractere, número, caractere, número, caractere, número.
 A resposta deverá ser apresentada e posteriormente simplificada. Deverá então ser apresentado o
 sinal de igualdade e em seguida a resposta simplificada. No caso de não ser possível uma simplificação,
 deve ser apresentada a mesma resposta após o sinal de igualdade.

Considerando N1 e D1 como numerador e denominador da primeira fração, segue a orientação
de como deverá ser realizada cada uma das operações:
Soma: (N1*D2 + N2*D1) / (D1*D2)
Subtração: (N1*D2 - N2*D1) / (D1*D2)
Multiplicação: (N1*N2) / (D1*D2)
Divisão: (N1/D1) / (N2/D2), ou seja (N1*D2)/(N2*D1)

Entrada
A entrada contem vários casos de teste. A primeira linha de cada caso de teste contem um inteiro
N (1 ≤ N ≤ 1*104), indicando a quantidade de casos de teste que devem ser lidos logo a seguir.
Cada caso de teste contém um valor racional X (1 ≤ X ≤ 1000), uma operação (-, +, * ou /) e outro
valor racional Y (1 ≤ Y ≤ 1000).

Saída
A saída consiste em um valor racional, seguido de um sinal de igualdade e outro valor racional,
que é a simplificação do primeiro valor. No caso do primeiro valor não poder ser simplificado,
o mesmo deve ser repetido após o sinal de igualdade.

Exemplo de Entrada:	Exemplo de Saída:
4                   10/8 = 5/4
1 / 2 + 3 / 4       -2/8 = -1/4
1 / 2 - 3 / 4       12/18 = 2/3
2 / 3 * 6 / 6       4/6 = 2/3
1 / 2 / 3 / 4

 */

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    for (j in 0 until n) {
        val N1 = input.nextInt()
        input.next()
        val D1 = input.nextInt()
        val operacao = input.next()[0]
        val N2 = input.nextInt()
        input.next()
        val D2 = input.nextInt()
        var N3 = 0
        var D3 = 1
        when (operacao) {
            '+' -> {
                N3 = N1 * D2 + N2 * D1
                D3 = D1 * D2
            }
            '-' -> {
                N3 = N1 * D2 - N2 * D1
                D3 = D1 * D2
            }
            '/' -> {
                N3 = N1 * D2
                D3 = N2 * D1
            }
            '*' -> {
                N3 = N1 * N2
                D3 = D1 * D2
            }
        }
        val d3 = D3
        val n3 = N3
        val max = Math.max(N3, D3)
        var irredutivel = false
        while (!irredutivel) {
            irredutivel = true
            for (i in max - 1 downTo 2) {
                if (N3 % i == 0 && D3 % i == 0) { // se for divisor do numerador e do denominador, divide
                    N3 = N3 / i
                    D3 = D3 / i
                    irredutivel = false
                }
            }
        }
        println("$n3/$d3 = $N3/$D3")
    }
}



