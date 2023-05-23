package com.catsanddogs.agendamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catsanddogs.agendamentos.models.Animal;

@Repository
public interface AnimaisRepository extends JpaRepository<Animal, Long>{}
