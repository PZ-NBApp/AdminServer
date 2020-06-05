package com.nbapp.adminserver.modules.assignation

import javax.persistence.*
import com.nbapp.adminserver.modules.player.Player
import com.nbapp.adminserver.modules.team.Team

@Entity
data class Assignation(


        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "playerId")
        var player : Player,
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "teamId")
        var team : Team )
{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val assignationId: Int = 0
}