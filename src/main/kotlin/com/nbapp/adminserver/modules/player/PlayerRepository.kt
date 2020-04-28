package com.nbapp.adminserver.modules.player

import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepository : JpaRepository<Player, Int>