import java.text.NumberFormat
import java.util.*

class CekSaldo(): JenisMenuPilihan() {

    override fun cekSaldo() {
        val nominalSaldo = 500000

//        this is format to US currency
        val localID = Locale("in", "ID")
        val format = NumberFormat.getCurrencyInstance(localID)
        val changeFormatSaldo = format.format(nominalSaldo).toString().replace("Rp", "")

        println("Jumlah Saldo Anda Sebesar ${changeFormatSaldo.replace(changeFormatSaldo, "Rp. $changeFormatSaldo")}")
    }
}