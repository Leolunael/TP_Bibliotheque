package model

import enum.Genre
import model.Livre
import model.Magazine
import model.Document

fun main(){
    var livre1 = Livre("Vipère au poing", 1948, "Hervé Bazin", 256, Genre.CLASSIQUE)
    var livre2 = Livre("Symfony 6", 2024, "Etienne Langlet",530, Genre.CONTEMPORAIN)
    var magazine1 = Magazine("Canard PC", 2023, 420)

    println(livre1.afficherInfos())
    println(livre2.afficherInfos())
    println(magazine1.afficherInfos())

    val listDeString = mutableListOf<String>("livre1", "livre2", "magazine1")

    listDeString.sort()
    println("Taille de la liste : ${listDeString.size}")

    for(chaine in listDeString){
        println(chaine)
    }




}

