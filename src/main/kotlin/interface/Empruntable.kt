package model.`interface`

import model.Livre

interface Empruntable{
    var estEmprunte: Boolean

    abstract fun emprunter()
    abstract fun rendre()
}