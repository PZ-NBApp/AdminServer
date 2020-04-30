package com.nbapp.adminserver.modules.game

import javax.persistence.*
import com.nbapp.adminserver.modules.team.Team

@Entity
class Game(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val gameId: Int? = null,

        val hostId: Int,

        val guestId: Int,

        val hostResult: Int,

        val guestResult: Int
)