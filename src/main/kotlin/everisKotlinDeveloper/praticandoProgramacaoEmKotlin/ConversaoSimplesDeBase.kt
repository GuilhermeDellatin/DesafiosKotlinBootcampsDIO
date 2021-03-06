package everisKotlinDeveloper.praticandoProgramacaoEmKotlin

/*
Neste problema você é solicitado a escrever um simples programa de conversão de base.
A entrada será um valor hexadecimal ou decimal. Você deverá converter cada valor da entrada.
Se o valor for hexadecimal, você deve convertê-lo para decimal e vice-versa.
O valor hexadecimal inicia sempre com “0x” ou também, é aquele valor cuja segunda casa contém a letra 'x'.

Entrada
A entrada contém vários casos de teste. Cada linha de entrada, com exceção da última,
contém um número não-negativo, decimal ou hexa. O valor decimal será menor ou igual a 231.
A última linha contém um número negativo que não deve ser processado, indicando o encerramento do programa.

Saída
Para cada linha de entrada (exceto a última) deve ser produzido uma linha de saída.
Todos os números hexadecimal deve ser precedido na saída por '0x' (zero xis).


Exemplo de Entrada:	Exemplo de Saída:
4                   0x4
7                   0x7
44                  0x2C
0x80685             525957
-1
 */

fun main() {
    val patternHexadecimal = """0[a-zA-Z].*""".toRegex()
    val patternHex = """[a-zA-Z].*""".toRegex()
    val listatotal = mutableListOf<String>()
    var valor = true

    while(valor) {
        val leitura = readLine()!!.toString()

        if (!leitura.contains(patternHexadecimal) && leitura.toInt() > 0 && leitura.toInt() < Integer.MAX_VALUE)  {
            val n = leitura.toInt()
            val decimal = Integer.toHexString(n).toUpperCase()
            val decimalCompleto = "0x$decimal"

            listatotal.add(decimalCompleto)
        }

        if(leitura == "-1"){
            valor = false
        }

        if (leitura.contains(patternHexadecimal) && leitura.contains(patternHex)) {
            val remover = leitura.removeRange(0,2)
            val result: Int = remover.toInt(16)
            listatotal.add(result.toString())
        }
    }

    for (i in listatotal){
        println(i)
    }
}