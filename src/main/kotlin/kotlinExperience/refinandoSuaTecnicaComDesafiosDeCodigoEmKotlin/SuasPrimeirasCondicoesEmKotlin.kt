package kotlinExperience.refinandoSuaTecnicaComDesafiosDeCodigoEmKotlin

/*
Desafio
Faça um programa que receba

Caso a média seja < 5 imprima "REP";
Caso a média seja >= 5 e < 7 imprima "REC";
Caso a média seja >7 imprima "APR".
Entrada
A entrada consiste em vários arquivos de teste, cada um com uma linha, que conterá o valor da média do aluno.
Conforme mostrado no exemplo de entrada a seguir.

Saída
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio,
será gerado uma linha com a palavra
"Reprovado" caso sua média seja < 5,
"Recuperação" caso sua média seja >= 5 e < 7 e
"Aprovado" caso a média seja > 7.
Use o exemplo abaixo para clarear o que está sendo pedido.

Exemplos de Entrada	Exemplos de Saída
    5.5                     REC
    8                       APR
    2	                    REP
*/

fun main() {
    val media = readLine()!!.toDouble()

    if(media <= 10) {
        when {
            media < 5 -> println("REP")
            media > 7 -> println("APR")
            else -> println("REC")
        }
    }

}