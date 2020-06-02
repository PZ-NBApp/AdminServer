package com.nbapp.adminserver.modules.assignation

import com.nbapp.adminserver.modules.player.Player
import org.springframework.stereotype.Service

@Service
class AssignationService(private val assignationRepository: AssignationRepository) {

    fun getAssignations():Iterable<Assignation>
    {
        return assignationRepository.findAll()
    }

    //TODO
    //lista wszystkich zawodników danego zespołu
    /*fun getAllTeamPlayers(idTeam:Int):Iterable<Player>{
        return assignationRepository.findAllById(idTeam)
    }*/

    fun getAssignationById(id:Int):Assignation{
        return assignationRepository.getOne(id)
    }

    fun deleteAssignation(id:Int){
        return assignationRepository.deleteById(id)
    }

    fun addAssignation(assignation: Assignation):Assignation {
        return assignationRepository.save(assignation)
    }
}