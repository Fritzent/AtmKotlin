internal interface SaldoAtribute {
    var NOMINAL_SALDO: Int

    fun doPengurangan(): Int
    fun doPenambahan(): Int
}