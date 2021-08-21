package santanderAndroidDeveloper.solucionandoDesafiosEmKotlin

/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:


Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura,
mostrando a mensagem


Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.

Exemplo de entrada:     Exemplo de saida:
6.0 4.0 2.0             Area = 10.0

6.0 4.0 2.1             Perimetro = 12.1
 */

fun main() {
    fun Double.format(digits: Long) = "%.${digits}f".format(this).replace(',','.')
    val (a, b, c) = readLine()!!.split(" ").map {it.toDouble()}

    val p = (a + b + c).format(1)
    val r = (((a + b) * c / 2)).format(1)

    if (a < (b + c) && b < (a + c) && c < (a + b))
        println("Perimetro = $p")
    else println("Area = $r")
}