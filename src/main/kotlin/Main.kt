package model

import model.Livre
import model.Magazine

fun main(){
    var livre1 = Livre("Vipère au poing", 1948, "Hervé Bazin", 256, "CLASSIQUE")
    var livre2 = Livre("Symfony 6", 2024, "Etienne Langlet",530,  "CONTEMPORAIN")
    var magazine1 = Magazine("Canard PC", 2023, 420)

    livre1.estEmprunter()


}
