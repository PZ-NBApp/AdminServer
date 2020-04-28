package com.nbapp.adminserver.modules.game

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/game")
class GameController (private val gameService: GameService)
{

}