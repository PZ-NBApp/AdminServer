package com.nbapp.adminserver.modules.assignation

import javax.persistence.*
import com.nbapp.adminserver.modules.player.Player
import com.nbapp.adminserver.modules.team.Team

@Entity
class Assignation(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val assignationId: Int? = null,

        val playerId: Int,

        val teamId: Int

)