package app

class ControlGame(private val callback: Callback): InterfaceControllerGame {
    override fun rpsgame(masukan1: String, masukan2: String){
        if (masukan1 != null && masukan2 != null && masukan1 != "" && masukan2 != ""){
            if (masukan1==masukan2){
                callback.hasil("Draw")
            }
            else if (masukan1 == "gunting"){
                if (masukan2 == "kertas"){
                    callback.hasil("Pemain 1 menang")
                }
                else{
                    callback.hasil("Pemain 2 menang")
                }
            }
            else if (masukan1 == "batu"){
                if (masukan2 == "gunting"){
                    callback.hasil("Pemain 1 menang")
                }
                else{
                    callback.hasil("Pemain 2 menang")
                }
            }
            else if (masukan1 == "kertas"){
                if (masukan2 == "gunting"){
                    callback.hasil("Pemain 2 menang")
                }
                else{
                    callback.hasil("Pemain 1 menang")
                }
            }
        }
        else{
            callback.hasil("Hasil masukan null")
        }
    }
}