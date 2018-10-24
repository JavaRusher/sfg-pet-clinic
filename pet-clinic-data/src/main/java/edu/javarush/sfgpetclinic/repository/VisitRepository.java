package edu.javarush.sfgpetclinic.repository;

import edu.javarush.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
