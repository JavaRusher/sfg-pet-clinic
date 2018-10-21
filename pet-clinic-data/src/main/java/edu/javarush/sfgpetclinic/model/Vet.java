package edu.javarush.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialites = new HashSet<>();;
    public Set<Speciality> getSpecialites() {
        return specialites;
    }

    public void setSpecialites(Set<Speciality> specialites) {
        this.specialites = specialites;
    }



}
