package com.nbapp.adminserver.modules.assignation

import com.nbapp.adminserver.modules.player.Player
import com.nbapp.adminserver.modules.player.PlayerRepository
import com.nbapp.adminserver.modules.team.Team
import com.nbapp.adminserver.modules.team.TeamRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AssignationService(private val assignationRepository: AssignationRepository, val teamRepository: TeamRepository, val playerRepository: PlayerRepository) {

    fun getAssignations():Iterable<Assignation>
    {
        return assignationRepository.findAll()
    }

    fun getAssignationById(id:Int):Assignation{
        return assignationRepository.getOne(id)
    }

    fun deleteAssignation(id:Int){
        return assignationRepository.deleteById(id)
    }

    fun addAssignation(assignation : Map<String, String>) {
        val idPlayer: Int = assignation.getValue("player").toInt()
        val player : Player = playerRepository.findById(idPlayer).orElseThrow()
        val idTeam : Int = assignation.getValue("team").toInt()
        val team : Team = teamRepository.findById(idTeam).orElseThrow()
        assignationRepository.save(Assignation(player,team))
    }
    @Transactional
    fun deleteAllTeamAssignation(teamId : Int)
    {

        return assignationRepository.deleteAssignationByTeamTeamId(teamId)
    }
    @Transactional
    fun getAllByTeamId(teamId : Int) : Iterable<Assignation>
    {
        return assignationRepository.findAssignationsByTeamTeamId(teamId)
    }
}