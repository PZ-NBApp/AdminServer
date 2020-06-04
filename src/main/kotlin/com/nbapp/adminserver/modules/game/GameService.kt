package com.nbapp.adminserver.modules.game

import com.nbapp.adminserver.modules.team.Team
import com.nbapp.adminserver.modules.team.TeamRepository
import org.springframework.stereotype.Service

@Service
class GameService(private val gameRepository: GameRepository, private val teamRepository:TeamRepository) {
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
            val game:Game=gameRepository.getOne(id)
            val hostId:Int=game.hostId
            val guestId:Int=game.guestId
            val host:Team= teamRepository.getOne(hostId)
            val guest:Team=teamRepository.getOne(guestId)
            game.updateHostResult(hostResult)
            game.updateGuestResult(guestResult)
            if (hostResult>guestResult){
                host.wonGame()
                guest.lostGame()

            }
            else
            {
                host.lostGame()
                guest.wonGame()
            }
            return gameRepository.save(game)
        }
    }