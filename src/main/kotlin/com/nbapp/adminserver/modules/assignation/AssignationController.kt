package com.nbapp.adminserver.modules.assignation

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/assignation")
class AssignationController (private val assignationService: AssignationService)
{

}