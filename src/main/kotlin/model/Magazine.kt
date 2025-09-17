package model

import model.Document

class Magazine(titre: String, anneePublication: Int, var numero: Int): Document(titre, anneePublication) {


    override fun afficherInfos(){
        println("Les infos du magazine sont: " +
                "$titre, " + "$anneePublication, " + "$numero")
    }
}