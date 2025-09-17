package model

import enum.Genre
import model.Document

class Livre(titre: String, anneePublication: Int, var auteur: String, var nbPages: Int, var genre: Genre): Document(titre, anneePublication) {


    constructor(
        titre: String,
        auteur: String,
        genre: Genre):
        this(titre, 0, auteur, 100, genre){


        this.titre = titre
        this.anneePublication = anneePublication
        this.auteur = auteur
        this.nbPages = nbPages
        this.genre = genre
    }

    override fun afficherInfos(){
        println("Les infos du livre sont: " +
                "$titre, " + "$anneePublication, " + "$auteur, " + "$nbPages, " + "$genre")
    }

    var estEmprunte: Boolean = false

    fun emprunter(){
        estEmprunte = true
        println("$titre a été emprunté")
    }
    fun rendre(){
        estEmprunte = false
        println("$titre a été rendu")
    }

    companion object


}