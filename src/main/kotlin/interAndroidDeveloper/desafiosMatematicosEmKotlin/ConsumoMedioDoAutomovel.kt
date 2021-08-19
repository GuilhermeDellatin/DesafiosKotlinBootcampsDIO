package interAndroidDeveloper.desafiosMatematicosEmKotlin

/*
Desafio:

Você deve calcular o consumo médio de um automóvel onde será informada a distância
total percorrida (em Km) e o total de combustível consumido (em litros).

Entrada
Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km),
e um valor real Y que representa o total de combustível consumido, com um dígito após o ponto decimal.

Saída
Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula),
incluindo no final a mensagem "km/l".

Exemplo de Entrada	Exemplo de Saída
500                 14.286 km/l
35.0

2254                18.119 km/l
124.4

4554                9.802 km/l
464.6
 */

import java.util.Scanner

fun main() {
    val leitor = Scanner(System.`in`)
    val x: Int = leitor.nextInt()
    val y: Double = leitor.nextDouble()

    val media = x / y

    println(String.format("%.3f km/l", media))
}