package com.nbapp.adminserver.modules.table

import com.nbapp.adminserver.modules.team.Team
import com.nbapp.adminserver.modules.team.TeamRepository
import org.springframework.data.domain.Sort
import org.springframework.data.web.SortDefault
import org.springframework.stereotype.Service

@Service
class TabelaService (private val teamRepository: TeamRepository) {
    fun getTable(): Iterable<Team>
    {
        return teamRepository.findAll(Sort.by(Sort.Direction.DESC,"winPercentage"))

    }
}