package com.nbapp.adminserver.modules.team

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/team")
class TeamController (private val teamService: TeamService)
{
    @GetMapping
    fun getTeams():Iterable<Team> {
        return teamService.getTeams()
    }

    @GetMapping("/{id}")
    fun getTeamById(@PathVariable id : Int) : Team {
        return teamService.getTeamById(id)
    }

    @PostMapping("/add")
    fun addTeam(@RequestBody newTeam : Team) : Team {
        return teamService.addTeam(newTeam)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteTeam(@PathVariable id : Int) {
        return teamService.deleteTeam(id)

    }
}