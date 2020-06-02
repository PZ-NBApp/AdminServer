package com.nbapp.adminserver.modules.game

import com.nbapp.adminserver.modules.player.Player
import org.springframework.stereotype.Service

@Service
class GameService(private val gameRepository: GameRepository) {
    fun getGames():Iterable<Game>{
        return gameRepository.findAll()
    }

    fun getGameById(id : Int): Game {
        return gameRepository.getOne(id)
    }

    fun addGame(game: Game): Game {
        return gameRepository.save(game)
    }

    fun deleteGame(id : Int) {
        return gameRepository.deleteById(id)
    }

    fun updateGame(id:Int, text:Map<String,Int>): Game {
        val hostResult:Int=text.getValue("hostResult").toInt()
        val guestResult:Int=text.getValue("guestResult").toInt()
        val game:Game=gameRepository.findById(id).orElseThrow()
        game.updateHostResult(hostResult)
        game.updateGuestResult(guestResult)
        return gameRepository.save(game)
    }
}