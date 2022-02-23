import kotlin.math.pow

class Calculadora2 {
    fun forcaPeso(massa: Float, gravidade: Float): Float {
        return massa * gravidade
    }

    fun forcaCentripeta(massa: Float, velocidade: Float, raio: Float): Float {
        return massa * (velocidade.pow(2) / raio)
    }

    fun impulso(forcaResultante: Float, intervaloDeTempo: Float): Float {
        return forcaResultante * intervaloDeTempo
    }

    fun forcaElastica(constanteElastica: Float, alongamentoDaMola: Float): Float {
        return constanteElastica * alongamentoDaMola
    }

    fun velocidadeMedia(distanciaPercorrida: Float, intervalodeTempo: Float): Float {
        return distanciaPercorrida / intervalodeTempo
    }

    fun mru(posicaoInicial: Float, velocidademru: Float, intervaloTempo: Float): Float {
        return posicaoInicial + (velocidademru * intervaloTempo)
    }

    fun mruv(posicaoInicial: Float, velocidadeInicial: Float, tempo: Float, aceleracao: Float): Float {
        return posicaoInicial + (velocidadeInicial * tempo) + (aceleracao * tempo.pow(2) / 2)
    }


}
