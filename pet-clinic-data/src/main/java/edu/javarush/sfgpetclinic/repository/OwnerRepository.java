package edu.javarush.sfgpetclinic.repository;

import edu.javarush.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
