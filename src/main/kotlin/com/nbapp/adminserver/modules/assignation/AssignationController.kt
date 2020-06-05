package com.nbapp.adminserver.modules.assignation

import com.nbapp.adminserver.modules.player.Player
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/assignation")
class AssignationController (private val assignationService: AssignationService) {
    @GetMapping
    fun getAssignations(): Iterable<Assignation> {
        return assignationService.getAssignations()
    }

    @GetMapping("/{id}")
    fun getAssignationById(@PathVariable id: Int): Assignation {
        return assignationService.getAssignationById(id)
    }

    @PostMapping("/add")
    fun addAssignation(@RequestBody newAssignation: Map<String, String>) {
        return assignationService.addAssignation(newAssignation)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteAssignation(@PathVariable id: Int) {
        assignationService.deleteAssignation(id)
    }

    @org.springframework.transaction.annotation.Transactional
    @DeleteMapping("/deleteTeams/{id}")
    fun deleteAssignationByTeamId(@PathVariable id: Int) {
        assignationService.deleteAllTeamAssignation(id)
    }

    @Transactional
    @GetMapping("/team/{id}")
    fun getTeamAllPlayers(@PathVariable id: Int): Iterable<Assignation> {
        return assignationService.getAllByTeamId(id)
    }
}