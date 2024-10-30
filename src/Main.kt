fun main() {

    var progect: Boolean = true


    while (progect == true) {
        print("Selecione um Projeto 1-3: ")
        var select = readln().toInt()
        println()

        if (select == 1) {
            Att1()
        } else if (select == 2) {
            Att2()
        } else if (select == 3) {
            Att3()
        }

        //continuar ou encerrar o programa
        print("Continuar? (S/N): ")
        var continuar = readln().toLowerCase()
        if (continuar == "n") {
            progect = false
        }
    }
}
