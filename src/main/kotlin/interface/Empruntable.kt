package model.`interface`

import model.Livre

interface Empruntable{
    var estEmprunte: Boolean = false

    abstract fun emprunter()
    abstract fun rendre()
}