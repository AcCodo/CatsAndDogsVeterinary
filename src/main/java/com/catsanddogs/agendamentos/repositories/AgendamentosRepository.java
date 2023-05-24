package com.catsanddogs.agendamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catsanddogs.agendamentos.models.Agendamento;

@Repository
public interface AgendamentosRepository extends JpaRepository<Agendamento, Long>{}
