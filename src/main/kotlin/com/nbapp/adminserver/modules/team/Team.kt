package com.nbapp.adminserver.modules.team

//import jdk.jfr.Percentage
import javax.persistence.*

@Entity
class Team(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val teamId: Int? = null,

        val name: String,

        val city: String,

        var gamesPlayed: Int,

        var gamesWon: Int,

        var gamesLost: Int

        //val winPercentage: Percentage
){
        fun wonGame(){
                gamesPlayed++
                gamesWon++
        }
        fun lostGame(){
                gamesPlayed++
                gamesLost++
        }
}