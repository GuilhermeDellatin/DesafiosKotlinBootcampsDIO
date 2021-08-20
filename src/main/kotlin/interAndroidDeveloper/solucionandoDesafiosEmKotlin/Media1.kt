package interAndroidDeveloper.solucionandoDesafiosEmKotlin

/*
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5
(A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Calcule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos após o ponto decimal e
com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e
como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário,
você receberá "Presentation Error".

Exemplos de Entrada:    Exemplos de Saída:
5.0                     MEDIA = 6.43182
7.1

0.0                     MEDIA = 4.84091
7.1

10.0                    MEDIA = 10.00000
10.0
 */

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    val a = reader.nextDouble()
    val b = reader.nextDouble()

    val weightA = 3.5
    val weightB = 7.5
    val totalWeight = weightA + weightB

    val m = (a * weightA  + b * weightB) / totalWeight
    val r = "%.5f".format(m)

    println("MEDIA = $r")
}