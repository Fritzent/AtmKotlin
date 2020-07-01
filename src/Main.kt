import saldo.SetorTunai
import saldo.TarikTunai
import saldo.UserSaldo
import java.text.NumberFormat
import java.util.*

fun main(){
    println("SELAMAT DATANG DI ATM BCA")

    print("Silahkan Masukkan PIN Anda : ")
    val checkPIN: Int = Scanner (System.`in`).nextInt()

    val checkPINChange = checkPIN.toString()

    if(checkPINChange.length < 6){
        println(" Maaf PIN Anda Salah. Silahkan Coba Lagi!")
        return main()
    }else{
        if (checkPINChange == "123456"){
            val userName ="Andri"
            println(" Selamat Datang $userName")
            processATM()
        }else{
            val userName = "Senno"
            println(" Selamat Datang $userName")
            processATM()
        }
    }
}

fun processATM(){
    val menuATM = Menu ()

    println(" ")
    println("===========================")
    println("== ATM BCA CABANG BINAR  ==")
    println("===========================")
    menuATM.caseCekSaldo()
    menuATM.caseTarikTunai()
    menuATM.caseSetorTunai()
    menuATM.caseSelesai()
    println("===========================")
    println("===========================")

    val checkMenuSelected = Scanner (System.`in`)
    println(" Note: Gunakan 1,2,3,4 untuk memilih menu")
    print(" Menu Pilihan Anda: ")

    try {
        when (checkMenuSelected.nextInt()){
            1 -> {
                println("=======================")
                menuATM.caseCekSaldo()
                println("=======================")

                val checkSaldoUser = UserSaldo()
                val nominalSaldoUser = checkSaldoUser.setterNominalValue

                //        this is format to US currency
                val localID = Locale("in", "ID")
                val format = NumberFormat.getCurrencyInstance(localID)
                val changeFormatSaldo = format.format(nominalSaldoUser).toString().replace("Rp", "")

                println("Jumlah Saldo Anda Sebesar ${changeFormatSaldo.replace(changeFormatSaldo, "Rp. $changeFormatSaldo")}")

                println("Masih ingin melakukan transaksi?? (Ya/Tidak) ")
                val checkNextStudy: String = readLine()!!
                if (checkNextStudy == "Ya") {
                    return processATM()
                } else {
                    println(" Terima Kasih!! ")
                }
            }
            2 -> {
                print(" Silahkan masukkan nominal uang yang ingin ditarik: ")
                val checkNominalTarikan = Scanner (System.`in`).nextInt()

                val penarikanTunai = TarikTunai(checkNominalTarikan)
                penarikanTunai.doPengurangan()

                //        this is format to US currency
                val localID = Locale("in", "ID")
                val format = NumberFormat.getCurrencyInstance(localID)
                val changeFormatSaldo = format.format(penarikanTunai.NOMINAL_SALDO).toString().replace("Rp", "")

                println(" Terima transaksi anda berhasil!")
                println(" Jumlah Saldo Anda Saat Ini ${changeFormatSaldo.replace(changeFormatSaldo, "Rp. $changeFormatSaldo")}")

                println("Masih ingin melakukan transaksi?? (Ya/Tidak) ")
                val checkNextStudy: String = readLine()!!
                if (checkNextStudy == "Ya") {
                    return processATM()
                } else {
                    println(" Terima Kasih!! ")
                }
            }
            3 -> {
                print(" Silahkan masukkan nominal uang yang ingin disetor: ")
                val checkNominalSetoran = Scanner (System.`in`).nextInt()

                val penyetoranTunai = SetorTunai(checkNominalSetoran)
                penyetoranTunai.doPenambahan()

                //        this is format to US currency
                val localID = Locale("in", "ID")
                val format = NumberFormat.getCurrencyInstance(localID)
                val changeFormatSaldo = format.format(penyetoranTunai.NOMINAL_SALDO).toString().replace("Rp", "")

                println(" Terima transaksi anda berhasil!")
                println(" Jumlah Saldo Anda Saat Ini ${changeFormatSaldo.replace(changeFormatSaldo, "Rp. $changeFormatSaldo")}")

                println("Masih ingin melakukan transaksi?? (Ya/Tidak) ")
                val checkNextStudy: String = readLine()!!
                if (checkNextStudy == "Ya") {
                    return processATM()
                } else {
                    println(" Terima Kasih!! ")
                }
            }
            4 -> {
                println("======  =============================  ======")
                println("======        ATM BCA Shutdown         ======")
                println("======  =============================  ======")
            }
        }
    } catch(ex: InputMismatchException) {
        println(" Check note untuk cara memilih menu!")
        return processATM()
    }
}