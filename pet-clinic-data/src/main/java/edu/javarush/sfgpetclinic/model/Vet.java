package edu.javarush.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();;
    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialites(Set<Speciality> specialites) {
        this.specialities = specialites;
    }


}
