package com.nbapp.adminserver.modules.table

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TabelaRepository :JpaRepository<Tabela, Int>
