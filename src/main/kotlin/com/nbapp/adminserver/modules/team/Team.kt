package com.nbapp.adminserver.modules.team

import jdk.jfr.Percentage
import javax.persistence.*

class Team(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val teamId: Int? = null,

        val name: String,

        val city: String,

        val gamesPlayed: Int,

        val gamesWon: Int,

        val gamesLost: Int,

        val winPercentage: Percentage
)