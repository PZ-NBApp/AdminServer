package com.nbapp.adminserver.modules.assignation

import com.nbapp.adminserver.modules.player.Player
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AssignationRepository: JpaRepository<Assignation, Int>{
    //fun findAllByTeamTeamId(teamId:Int):List<Player>
    fun deleteAssignationByTeamId(teamId: Int)
}