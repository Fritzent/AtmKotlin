open class JenisMenuPilihan {
    val nominalSaldo = 500000

    open fun cekSaldo(){
        println(" ======================================================= ")
        println(" === JANGAN BERITAHU PIN ANDA KE ORANG TIDAK DIKENAL ===")
        println(" ======================================================= ")
    }
    open fun tarikSaldo(){
        println(" ========================================= ")
        println(" === Rumus : userInput X - userInput Y ===")
        println(" ========================================= ")
    }
    open fun setorTunai(){
        println(" ========================================= ")
        println(" === Rumus : userInput X * userInput Y ===")
        println(" ========================================= ")
    }
    open fun Exit(){
        println(" ========================================= ")
        println(" === Rumus : userInput X / userInput Y ===")
        println(" ========================================= ")
    }
}