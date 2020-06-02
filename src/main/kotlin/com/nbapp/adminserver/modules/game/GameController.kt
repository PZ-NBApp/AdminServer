package com.nbapp.adminserver.modules.game

import com.nbapp.adminserver.modules.player.Player
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/game")
class GameController (private val gameService: GameService)
{
    @GetMapping
    fun getGames():Iterable<Game> {
        return gameService.getGames()
    }

    @GetMapping("/{id}")
    fun getGameById(@PathVariable id:Int): Game {
        return gameService.getGameById(id)
    }

    @PostMapping("/add")
    fun addGame(@RequestBody newGame: Game) {
        gameService.addGame(newGame)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteGame(@PathVariable id : Int) {
        gameService.deleteGame(id)
    }

    @PatchMapping("/{id}")
    fun enterGamerResult(@PathVariable id: Int, @RequestBody text:Map<String,Int>) {
        gameService.updateGame(id, text)
    }
}