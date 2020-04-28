package com.nbapp.adminserver.modules.player

import javax.persistence.*

class Player(
    @Id
    @GeneratedValue
    val playerId: Int? =null,

    val firstName: String,

    val surname: String
)