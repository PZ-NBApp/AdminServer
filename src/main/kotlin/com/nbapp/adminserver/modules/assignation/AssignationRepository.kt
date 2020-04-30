package com.nbapp.adminserver.modules.assignation

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AssignationRepository: JpaRepository<Assignation, Int>