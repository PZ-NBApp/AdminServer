package com.nbapp.adminserver.modules.team

import javax.persistence.*

@Entity
data class Team(
        val name: String,

        val city: String,

        var gamesPlayed: Int,

        var gamesWon: Int,

        var gamesLost: Int,

        var winPercentage: Float
)
{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val teamId: Int? = null
        fun wonGame(){
                winPercentage = 0.0F
                gamesPlayed++
                gamesWon++
                winPercentage = (gamesWon/gamesPlayed).toFloat()
        }
        fun lostGame(){
                winPercentage = 0.0F
                gamesPlayed++
                gamesLost++
                winPercentage = (gamesWon/gamesPlayed).toFloat()
        }

}