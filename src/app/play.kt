package app

object Main : Callback {
    @JvmStatic
    fun main(arg: Array<String>) {
        do{
            println("==================================")
            println("Game suit (batu, gunting, kertas)")
            println("==================================")
            println("Pilih menu:")
            println("1. Main")
            println("2. Keluar")
            print("Pilihan saya: ")
            val newChoice: Int = readLine()!!.toInt()
            if (newChoice == 1){
                println("================================")
                println("Game Suit")
                print("Masukan pemain 1: ")
                val masukan1 = readLine().toString().lowercase()
                print("Masukan pemain 2: ")
                val masukan2 = readLine().toString().lowercase()

                println("Hasil: ")
//              Controller Game
                val arrMasukan = arrayOf("gunting", "batu", "kertas")
                if (masukan1 !in arrMasukan || masukan2 !in arrMasukan){
                    println("Masukan anda salah")
                }else{
                    val bermain = ControlGame(this)
                    bermain.rpsgame(masukan1, masukan2)
                }
            }else if (newChoice == 2){
                println("Sampai jumpa")
                break
            }else{
                println("Pilihan anda salah")
                break
            }
        }while (newChoice<2 || newChoice!= 1)
    }

    override fun hasil(hasil: String) {
        println(hasil)
    }
}
