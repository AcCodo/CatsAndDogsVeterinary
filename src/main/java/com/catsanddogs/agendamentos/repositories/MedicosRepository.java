package com.catsanddogs.agendamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catsanddogs.agendamentos.models.Medico;

@Repository
public interface MedicosRepository extends JpaRepository<Medico, Long>{}
