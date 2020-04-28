package com.nbapp.adminserver.modules.game

import org.springframework.data.jpa.repository.JpaRepository

interface GameRepository : JpaRepository<Game, Int>