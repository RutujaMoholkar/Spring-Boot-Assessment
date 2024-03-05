package com.example.petmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petmanagementsystem.exception.PetNotFoundException;
import com.example.petmanagementsystem.model.Pet;
import com.example.petmanagementsystem.repository.PetRepository;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    // Add pet details
    public Pet addPet(Pet pet) {
        return petRepository.save(pet);
    }

    // Get all pets details
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    // Update pet details
    public Pet updatePet(Long id, Pet updatedPet) {
        Optional<Pet> optionalExistingPet = petRepository.findById(id);
        if (optionalExistingPet != null) {
            Pet existingPet = optionalExistingPet.get();
            existingPet.setName(updatedPet.getName());
            existingPet.setAge(updatedPet.getAge());
            existingPet.setBreed(updatedPet.getBreed());
            existingPet.setDescription(updatedPet.getDescription());
            return petRepository.save(existingPet);
        } else {
            throw new PetNotFoundException("Pet with ID " + id + " not found");
        }
    }

    // Delete Pet deatils
    public void deletePetById(Long id) {
        petRepository.deleteById(id);
    }

}
