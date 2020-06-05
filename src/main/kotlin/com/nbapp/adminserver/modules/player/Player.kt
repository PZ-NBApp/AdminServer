package com.nbapp.adminserver.modules.player

import javax.persistence.*

@Entity
data class Player (
        var firstName: String,
        var surname: String
)
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val playerId: Int = 0
}