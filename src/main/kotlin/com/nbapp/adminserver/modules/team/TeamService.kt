package com.nbapp.adminserver.modules.team

import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class TeamService(private val teamRepository: TeamRepository) {
    fun getTeams():Iterable<Team> {
        return teamRepository.findAll()
    }

    fun getTeamById(id : Int) : Team {
        return teamRepository.getOne(id)
    }

    fun addTeam(team : Team) : Team {
        return teamRepository.save(team)
    }
    // check what if delete team
    // and assignation remains??
    fun deleteTeam(id : Int) {
        return teamRepository.deleteById(id)
    }

    fun getStandings():Iterable<Team>{
        return teamRepository.findAll().sortedByDescending {  }
    }
}