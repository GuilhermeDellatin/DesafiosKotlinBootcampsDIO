package kotlinExperience.refinandoSuaTecnicaComDesafiosDeCodigoEmKotlin.desafioDeProjeto

/*
Aprenda Kotlin Com Exemplos: Desafio de Projeto (Lab)
Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório aprenda-kotlin-com-exemplos.
Nesse contexto, iremos abstrair o seguinte domínio de aplicação:

A DIO possui Formacoes incríveis que têm como objetivo oferecer um conjunto de ConteudosEducacionais voltados para
uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho.
Formacoes possuem algumas características importantes, como nome, nivel e seus respectivos conteudosEducacionais.
Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio,
definido pela capacidade de matricular um ou mais Alunos.

"Crie uma solução em Koltin abstraindo esse domínio. O arquivo [desafio.kt] te ajudará 😉"
 */

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}