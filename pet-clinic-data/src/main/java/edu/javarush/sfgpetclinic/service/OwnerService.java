package edu.javarush.sfgpetclinic.service;

import edu.javarush.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
