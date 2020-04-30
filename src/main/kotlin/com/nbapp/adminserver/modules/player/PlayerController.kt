package com.nbapp.adminserver.modules.player

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/players")
class PlayerController (private val playerService: PlayerService)
{
    @GetMapping
    fun getPlayers():Iterable<Player> {
        return playerService.getPlayers()
    }

    @GetMapping("/{id}")
    fun getPlayerById(@PathVariable id:Int): Player {
        return playerService.getPlayerById(id)
    }

    @PostMapping("/add")
    fun addPlayer(@RequestBody newPlayer : Player) {
        playerService.addPlayer(newPlayer)
    }

    @DeleteMapping("/delete/{id}")
    fun deletePlayer(@PathVariable id : Int) {
        playerService.deletePlayer(id)
    }
}