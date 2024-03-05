package com.example.petmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petmanagementsystem.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

}
