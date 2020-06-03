package com.nbapp.adminserver.modules.table
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Tabela (


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var TabelaId: Int? = null

)


