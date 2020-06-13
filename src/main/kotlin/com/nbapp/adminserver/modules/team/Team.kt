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
        val teamId: Int = 0
        fun wonGame(){
                val x : Float
                winPercentage = 0.0F
                gamesPlayed++
                gamesWon++
                winPercentage = (((gamesWon.toFloat()/gamesPlayed.toFloat())) * 100.0f)
        }
        fun lostGame(){
                val x : Float
                winPercentage = 0.0F
                gamesPlayed++
                gamesLost++
                winPercentage = (((gamesWon.toFloat()/gamesPlayed.toFloat())) * 100.0f)

        }

}