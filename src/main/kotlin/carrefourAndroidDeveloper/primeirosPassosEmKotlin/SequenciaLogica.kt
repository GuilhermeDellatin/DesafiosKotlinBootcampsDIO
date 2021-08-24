package carrefourAndroidDeveloper.primeirosPassosEmKotlin
/*
Detalhe
Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída vão ser apresentadas
na execução do programa, seguindo a lógica do exemplo mais abaixo.
Para os valores com mais de seis dígitos, todos os dígitos devem ser apresentados.

Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída
Imprima a saída conforme o exemplo fornecido.

Exemplo de entrada: 5
Exemplo de saída:
1 1 1
1 2 2
2 4 8
2 5 9
3 9 27
3 10 28
4 16 64
4 17 65
5 25 125
5 26 126

 */
import kotlin.math.pow

fun main() {
    val n = 1..(readLine() ?: return).toInt()
    n.forEach {
        println("$it ${(it.toDouble().pow(2)).toInt()} ${(it.toDouble().pow(3)).toInt()}")
        println("$it ${(it.toDouble().pow(2)).toInt() + 1} ${(it.toDouble().pow(3)).toInt() + 1}")
    }
}