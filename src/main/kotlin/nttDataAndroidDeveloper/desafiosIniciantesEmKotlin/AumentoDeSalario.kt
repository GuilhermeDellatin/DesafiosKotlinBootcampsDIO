package nttDataAndroidDeveloper.desafiosIniciantesEmKotlin

/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:


Salário	            Percentual de Reajuste
0 - 400.00          15%
400.01 - 800.00     12%
800.01 - 1200.00    10%
1200.01 - 2000.00   7%
Acima de 2000.00    4%


Leia o salário do funcionário e calcule e mostre o novo salário,
bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, que pode ser maior ou igual a zero, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho,
conforme exemplo abaixo.


Exemplo de Entrada:
400.00

Exemplo de Saída:
Novo salario: 460.00
Reajuste ganho: 60.00
Em percentual: 15 %

Exemplo de Entrada:
800.01

Exemplo de Saída:
Novo salario: 880.01
Reajuste ganho: 80.00
Em percentual: 10 %

Exemplo de Entrada:
2000.00

Exemplo de Saída:
Novo salario: 2140.00
Reajuste ganho: 140.00
Em percentual: 7 %

 */

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val salario = input.nextDouble()

    val reajuste = when {
        salario > 2000 -> 4
        salario > 1200 && salario <= 2000 -> 7
        salario > 800 && salario <= 1200 -> 10
        salario > 400 && salario <= 800 -> 12
        else -> 15
    }

    val novoSalario = salario + (salario * reajuste/100)
    val reajusteGanho = novoSalario - salario

    System.out.printf("Novo salario: %.2f\n", novoSalario)
    System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho)
    println("Em percentual: ${reajuste} %")
}