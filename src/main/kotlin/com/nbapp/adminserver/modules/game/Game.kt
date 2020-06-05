package com.nbapp.adminserver.modules.game

import javax.persistence.*

@Entity
class Game(


        val hostId: Int,

        val guestId: Int,

        var hostResult: Int,

        var guestResult: Int)
//TODO
//check wo this functions just insert in service
    {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val gameId: Int? = null
        fun updateHostResult(newResult: Int){
            hostResult = newResult
            }
        fun updateGuestResult(newResult: Int){
            guestResult=newResult
        }
    }
