package com.nbapp.adminserver.modules.player

import org.springframework.stereotype.Service

@Service
class PlayerService(private val playerRepository: PlayerRepository) {
    fun getPlayers():Iterable<Player> {
        return playerRepository.findAll()
    }

    fun getPlayerById(id : Int): Player {
        return playerRepository.getOne(id)
    }

    fun addPlayer(player:Player): Player {
        return playerRepository.save(player)
    }

    fun deletePlayer(id : Int) {
        return playerRepository.deleteById(id)
    }
}