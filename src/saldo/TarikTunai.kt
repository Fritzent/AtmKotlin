package saldo

internal class TarikTunai(nominalPengurang: Int): UserSaldo() {

    init {
        this.nominalPengurang = nominalPengurang
    }

    override fun doPengurangan(): Int {
//        val newPenampungPengurang = NOMINAL_SALDO - nominalPengurang
        NOMINAL_SALDO -= nominalPengurang
        return NOMINAL_SALDO
    }
}