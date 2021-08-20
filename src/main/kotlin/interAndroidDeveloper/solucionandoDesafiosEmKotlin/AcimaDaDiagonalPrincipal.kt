package interAndroidDeveloper.solucionandoDesafiosEmKotlin

import java.util.*

/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12].
Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima
da diagonal principal da matriz, conforme ilustrado abaixo (área verde).

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'),
indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz.
Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

Exemplo de Entrada: S, 1.0, 0.0, -3.5, 2.5, 4.1, ...
Exemplo de Saída: 12.6
 */

const val DIMENSION = 12

private fun Double.format(digits: Int) = "%.${digits}f"
    .format(this).replace(',','.')


fun readMatriz(): Array<DoubleArray>{
    val matriz = Array(DIMENSION){DoubleArray(DIMENSION)}
    for(lines in 0..(DIMENSION-1)){
        for(cols in 0..(DIMENSION-1)){
            matriz[lines][cols] = readLine()!!.toDouble()
        }
    }
    return matriz
}

fun getValoresAcimaDiagonalPrincipal(matriz: Array<DoubleArray>): MutableList<Double> {
    var colInit = 0
    var listaValores: MutableList<Double> = mutableListOf()
    for(line in 0..(DIMENSION-1)){
        colInit = line+1
        for(col in colInit..(DIMENSION-1)){
            listaValores.add(matriz[line][col])
        }
    }
    return listaValores
}

fun somaLista(list: MutableList<Double>): Double{
    var result = 0.0
    //for(i in 0..(list.size-1)){ //Deixe dessa forma para passar no teste da plataforma
    for(i in 0 until list.size){
        result += list[i]
    }
    return result
}

fun main() {

    //val operacao = readLine()!!.toUpperCase() //Deixe dessa forma para passar no teste da plataforma
    val operacao = readLine()!!.uppercase(Locale.getDefault())
    val matriz = readMatriz()

    val listaValores = getValoresAcimaDiagonalPrincipal(matriz)

    val soma = somaLista(listaValores)

    when(operacao){
        "S" -> { println("${soma.format(1)}")}
        "M" -> { println("${(soma/listaValores.size).format(1)}")}
    }
}

