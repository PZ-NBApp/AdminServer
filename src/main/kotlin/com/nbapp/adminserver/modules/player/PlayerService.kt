package com.nbapp.adminserver.modules.player

import org.springframework.stereotype.Service

@Service
class PlayerService(private val playerRepository: PlayerRepository) {
    fun getPlayers():Iterable<Player> {
        return playerRepository.findAll()
    }

    fun addPlayer(player:Player): Player {
        return playerRepository.save(player)
    }
}