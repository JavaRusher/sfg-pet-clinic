package edu.javarush.sfgpetclinic.service;

import edu.javarush.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
