package com.nbapp.adminserver.modules.player

import javax.persistence.*

@Entity
data class Player (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val playerId: Int? = null,

    val firstName: String,

    val surname: String
)