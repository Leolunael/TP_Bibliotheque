package model

import enum.Genre
import model.Document

class Livre(var auteur: String, var nbPages: Int, var genre: Genre): Document(titre, anneeProduction) {

    init{
        this.titre = titre
        this.auteur = auteur
        this.nbPages = nbPages
        this.genre = genre
        this.anneeProduction = anneeProduction

    }
    constructor(titre: String,
                auteur:String,
                nbPages: Int,
                genre: Genre,
                anneeProduction: Int):
            this(titre, auteur, 100, genre, 0){

        this.titre = titre
        this.auteur = auteur
        this.nbPages = nbPages
        this.genre = genre

    }

    Override fun afficherInfos(){
        println("Les infos du livre sont: ")
    }

}