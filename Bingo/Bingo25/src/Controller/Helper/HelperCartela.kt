package Controller.Helper

import Cartela
import SortearNumero
import View.CartelaView
import java.awt.Color

class HelperCartela(var view: CartelaView?) {

    public fun getCartelaView(): Cartela?{

        var result = Cartela(view!!.nomeDaCartela.text)

        var numerosCartelaView = arrayOf<Int>(view!!.b1.text.toInt(),view!!.b2.text.toInt(), view!!.b3.text.toInt(),view!!.b4.text.toInt(),view!!.b5.text.toInt(),view!!.b6.text.toInt(),view!!.b7.text.toInt(),view!!.b8.text.toInt(),view!!.b9.text.toInt(),view!!.b10.text.toInt(),view!!.b11.text.toInt(),view!!.b12.text.toInt(),view!!.b13.text.toInt(),view!!.b14.text.toInt(),view!!.b15.text.toInt(),view!!.b16.text.toInt(),view!!.b17.text.toInt(),view!!.b18.text.toInt(),view!!.b19.text.toInt(),view!!.b20.text.toInt(),view!!.b21.text.toInt(),view!!.b22.text.toInt(),view!!.b23.text.toInt(),view!!.b24.text.toInt(),view!!.b25.text.toInt())

        result.setNumerosDaCartela(numerosCartelaView)
        return result
    }

    public fun setCarletaView(numerosCartela: Cartela){

        var arrayAux = numerosCartela.getNumeros()

        view!!.b1.text = arrayAux[0].toString()
        view!!.b2.text = arrayAux[1].toString()
        view!!.b3.text = arrayAux[2].toString()
        view!!.b4.text = arrayAux[3].toString()
        view!!.b5.text = arrayAux[4].toString()
        view!!.b6.text = arrayAux[5].toString()
        view!!.b7.text = arrayAux[6].toString()
        view!!.b8.text = arrayAux[7].toString()
        view!!.b9.text = arrayAux[8].toString()
        view!!.b10.text = arrayAux[9].toString()
        view!!.b11.text = arrayAux[10].toString()
        view!!.b12.text = arrayAux[11].toString()
        view!!.b13.text = arrayAux[12].toString()
        view!!.b14.text = arrayAux[13].toString()
        view!!.b15.text = arrayAux[14].toString()
        view!!.b16.text = arrayAux[15].toString()
        view!!.b17.text = arrayAux[16].toString()
        view!!.b18.text = arrayAux[17].toString()
        view!!.b19.text = arrayAux[18].toString()
        view!!.b20.text = arrayAux[19].toString()
        view!!.b21.text = arrayAux[20].toString()
        view!!.b22.text = arrayAux[21].toString()
        view!!.b23.text = arrayAux[22].toString()
        view!!.b24.text = arrayAux[23].toString()
        view!!.b25.text = arrayAux[24].toString()
    }

    public fun setNome(nome: String) {
        view!!.nomeDaCartela.text = nome
    }

    public fun setCor(sorteio: SortearNumero){

        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b1.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b1.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b2.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b2.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b3.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b3.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b4.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b4.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b5.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b5.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b6.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b6.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b7.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b7.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b8.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b8.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b9.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b9.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b10.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b10.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b11.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b11.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b12.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b12.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b13.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b13.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b14.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b14.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b15.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b15.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b16.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b16.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b17.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b17.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b18.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b18.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b19.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b19.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b20.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b20.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b21.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b21.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b22.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b22.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b23.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b23.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b24.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b24.foreground = Color.RED
            }
        }
        for (i in 0..<sorteio.getNumerosSorteados().size){
            if(view!!.b25.text.toInt() == sorteio.getNumerosSorteados()[i]){
                view!!.b25.foreground = Color.RED
            }
        }
    }
}