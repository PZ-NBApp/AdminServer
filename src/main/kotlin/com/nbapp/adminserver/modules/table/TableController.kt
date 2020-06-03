package com.nbapp.adminserver.modules.table

import com.nbapp.adminserver.modules.team.Team
import com.nbapp.adminserver.modules.team.TeamService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/table")
class TabelaController (private val tabelaService: TabelaService) {
    @GetMapping
    fun getTabela():Iterable<Team>
    {
        return tabelaService.getTable()
    }
}