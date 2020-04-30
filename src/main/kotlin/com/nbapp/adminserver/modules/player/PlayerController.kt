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

    @PostMapping("/add")
    fun addPlayer(@RequestBody newPlayer : Player) {
        playerService.addPlayer(newPlayer)
    }
}