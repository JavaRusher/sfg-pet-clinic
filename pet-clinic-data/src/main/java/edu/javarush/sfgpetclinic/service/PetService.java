package edu.javarush.sfgpetclinic.service;

import edu.javarush.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
