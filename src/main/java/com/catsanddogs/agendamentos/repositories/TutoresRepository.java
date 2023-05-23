package com.catsanddogs.agendamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catsanddogs.agendamentos.models.Tutor;

@Repository
public interface TutoresRepository extends JpaRepository<Tutor, Long>{}
