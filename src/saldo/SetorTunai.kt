package saldo

internal class SetorTunai(nominalPenambah: Int): UserSaldo() {
    init {
        this.nominalPenambah = nominalPenambah
    }

    override fun doPenambahan(): Int {
//        val newPenampung = NOMINAL_SALDO + nominalPenambah
        NOMINAL_SALDO += nominalPenambah
        return NOMINAL_SALDO
    }
}