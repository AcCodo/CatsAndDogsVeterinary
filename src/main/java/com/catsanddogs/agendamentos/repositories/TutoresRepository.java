package com.catsanddogs.agendamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catsanddogs.agendamentos.models.Animal;
import com.catsanddogs.agendamentos.models.Especialidade;

@Repository
public interface TutoresRepository extends JpaRepository<Animal, Long>{}
