package saldo

import SaldoAtribute

internal open class UserSaldo(
    open protected var nominalPengurang: Int = 0,
    open protected var nominalPenambah: Int = 0
) : SaldoAtribute {

    override var NOMINAL_SALDO = 500000

    var setterNominalValue: Int
        set(value) {
            value.apply { NOMINAL_SALDO }
//        NOMINAL_SALDO = value
        } get() = NOMINAL_SALDO

    override fun doPengurangan(): Int {
        val newPenampungPengurang = NOMINAL_SALDO - nominalPengurang
        return newPenampungPengurang.apply { NOMINAL_SALDO }
    }

    override fun doPenambahan(): Int {
        val newPenampung = NOMINAL_SALDO + nominalPenambah
        return newPenampung.apply { NOMINAL_SALDO }
    }
}

//val tambahSaldo = (NOMINAL_SALDO + nominalPenambah)
//
//fun prosesPenambahanSaldo () = apply { NOMINAL_SALDO : $tambahSaldo}