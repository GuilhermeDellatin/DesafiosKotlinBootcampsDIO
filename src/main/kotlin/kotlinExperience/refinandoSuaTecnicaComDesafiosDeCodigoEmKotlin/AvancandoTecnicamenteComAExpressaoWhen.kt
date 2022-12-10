package kotlinExperience.refinandoSuaTecnicaComDesafiosDeCodigoEmKotlin

/*
Desafio
Geronimo acredita que perde muito tempo lembrando qual número do mês representa cada um deles.
Ele precisa de um programa que mude os meses do ano do calendário do celular dele para facilitar e agilizar a leitura.
Ajude-o e faça um programa que, com uma determinada entrada de uma data, retorne essa data com o mês escrito por extenso.

Entrada
As entradas serão datas em formato numeral. O dia ou mês que possuirem somente um digito, terão um 0 (zero) na frente.

Saida
As saídas serão as mesmas datas da entrada porém, com o mês escrito por extenso. O mês deve ter a primeira letra em maiúsculo.



EXEMPLO DE ENTRADA              EXEMPLO DE SAÍDA

  19/10/1997                 19 de Outubro de 1997

  25/12/2019                 25 de Dezembro de 2019

  02/02/2020                 02 de Fevereiro de 2020

 */

fun main() {
    val entrada: String? = readLine()
    val (dia, mes, ano) = entrada!!.split("/")

    val mesPorExtenso = when (mes.toInt()) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês Inválido!"
    }

    println("$dia de $mesPorExtenso de $ano")
}