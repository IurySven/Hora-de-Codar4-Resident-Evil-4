fun Att1(){

    var estudantes = mutableListOf("")
    var cont:Boolean = true
    var i = 0

    while (cont == true){

        print("Digite o Nome do Estudante: ")
        var nome = readln().toLowerCase()
        if (nome == "pare"){
            cont = false
        }else{
            estudantes.add(nome)
            i++
        }
    }
    println("$i Estudantes Foram Adicionados" +
            "$estudantes")

}

fun Att2(){

    var planetas = mutableListOf("Terra", "Marte", "Plutão", "Venus", "Jupiter", "Saturno").map { it.toLowerCase() }

    print("Digite um Nome de um Planeta: ")
    var n = readln().toLowerCase()
    if (planetas.contains(n)){
        println("Planeta $n Encontrado")
    }else{
        println("Planeta $n Não Encontrado")
    }

}

fun Att3(){

    var frutas = mutableListOf("maça", "banana", "maracuja", "laranja", "goiaba")

    while (frutas.isNotEmpty()) {

        println(frutas)
        print("Digite o Nome de uma Das Frutas: ")
        var n = readln().toLowerCase()

        if (frutas.contains(n)) {
            frutas.remove(n)
            println("Fruta foi retirada da lista")
            println()
        } else {
            println("Fruta indisponível no nosso mercado")
            println()
        }
    }

    println("Lista de compras finalizada")

}