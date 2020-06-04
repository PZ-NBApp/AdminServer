package com.nbapp.adminserver.modules.assignation

import javax.persistence.*
import com.nbapp.adminserver.modules.player.Player
import com.nbapp.adminserver.modules.team.Team

@Entity
class Assignation(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val assignationId: Int,

        @OneToOne
        @JoinColumn(name = "pId")
        val player: Player,
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name="tId")
        val team: Team

)