package com.nbapp.adminserver.modules.assignation

import com.nbapp.adminserver.modules.player.Player
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/assignation")
class AssignationController (private val assignationService: AssignationService)
{
    @GetMapping
    fun getAssignations():Iterable<Assignation> {
        return assignationService.getAssignations()
    }

    @GetMapping("/{id}")
    fun getAssignationById(@PathVariable id:Int): Assignation {
        return assignationService.getAssignationById(id)
    }

    @PostMapping("/add")
    fun addAssignation(@RequestBody newAssignation: Assignation) {
        assignationService.addAssignation(newAssignation)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteAssignation(@PathVariable id : Int) {
        assignationService.deleteAssignation(id)
    }

    //TODO
    /*@GetMapping("/team/id")
    fun getTeamAllPlayers(@PathVariable idTeam:Int){
        assignationService.getAllTeamPlayers(idTeam)
    }*/
}