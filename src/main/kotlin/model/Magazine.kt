package model

import model.Document

class Magazine(var numero: Int): Document() {



    Override fun afficherInfos(){
        println("Les infos du magazine sont: ")
    }
}