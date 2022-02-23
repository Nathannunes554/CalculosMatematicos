fun main(){
    println("informe o valor da massa: ")
    val massa: Float = readLine()!!.toFloat()
    println("informe o valor da gravidade: ")
    val gravidade: Float = readLine()!!.toFloat()

    val calc = Calculadora2()

    val forcaPeso = calc.forcaPeso(massa,gravidade)
    println("o resultado da forca peso é $forcaPeso")


    println("informe o valor da massac: ")
    val massac: Float = readLine()!!.toFloat()
    println("informe o valor da velocidade: ")
    val velocidade: Float = readLine()!!.toFloat()
    println("informe o valor do raio: ")
    val raio: Float = readLine()!!.toFloat()

    val calc2 = Calculadora2()

    val forcaCentripeta = calc.forcaCentripeta(massac,velocidade,raio)
    println("o resultado da forca centripeda é $forcaCentripeta")

    println("informe o valor da forca resultante: ")
    val forcaresultante: Float = readLine()!!.toFloat()
    println("informe o intervalo de tempo: ")
    val intervalodetempo: Float = readLine()!!.toFloat()

    val calc3 = Calculadora2()

    val impulso = calc.impulso(forcaresultante,intervalodetempo)
    println("o resultado do impulso é $impulso")

    println("informe a constante elastica: ")
    val constanteelastica: Float = readLine()!!.toFloat()
    println("informe o alongamento da mola: ")
    val alongamentodamola: Float = readLine()!!.toFloat()

    val calc4 = Calculadora2()

    val forcaelastica = calc.forcaElastica(constanteelastica,alongamentodamola)
    println("o resultado da forca elastica é $forcaelastica")

    println("informe a distancia percorrida: ")
    val distanciapercorrida: Float = readLine()!!.toFloat()
    println("informe o intervalo de tempovm: ")
    val intervalodetempovm: Float = readLine()!!.toFloat()

    val calc5 = Calculadora2()

    val velocidademedia = calc.velocidadeMedia(distanciapercorrida,intervalodetempovm)
    println("o resultado da velocidade media é $velocidademedia")

    println("informe posicao inicial: ")
    val posicaoinicialmru: Float = readLine()!!.toFloat()
    println("informe a velocidademru: ")
    val velocidademru: Float = readLine()!!.toFloat()
    println("informe o intervalo de tempo: ")
    val intervalodetempomru: Float = readLine()!!.toFloat()

    val calc6 = Calculadora2()

    val mru = calc.mru(posicaoinicialmru,velocidademru,intervalodetempomru)
    println("o resultado do mru é $mru")







}