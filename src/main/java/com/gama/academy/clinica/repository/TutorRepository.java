package com.gama.academy.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gama.academy.clinica.model.Tutor;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long>{

}
