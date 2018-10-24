package edu.javarush.sfgpetclinic.repository;

import edu.javarush.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
